/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Copyright 2013-2016 ForgeRock AS.
 */
package com.iplanet.dpro.session.operations.strategies;

import com.iplanet.dpro.session.Requests;
import com.iplanet.dpro.session.Session;
import com.iplanet.dpro.session.SessionException;
import com.iplanet.dpro.session.SessionID;
import com.iplanet.dpro.session.service.HttpConnectionFactory;
import com.iplanet.dpro.session.service.SessionServerConfig;
import com.iplanet.dpro.session.share.SessionInfo;
import com.iplanet.dpro.session.share.SessionRequest;
import com.iplanet.dpro.session.share.SessionResponse;
import com.sun.identity.shared.debug.Debug;

import org.forgerock.openam.session.SessionServiceURLService;
import org.forgerock.openam.session.service.ServicesClusterMonitorHandler;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.Arrays;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RemoteOperationsTest {

    private RemoteOperations remoteOperations;

    @Mock
    private Requests mockRequests;
    @Mock
    private Session mockRequester;
    @Mock
    private Session mockSession;
    @Mock
    private SessionID mockRequesterId;
    @Mock
    private SessionID mockSessionId;
    @Mock
    private SessionResponse mockResponse;
    @Mock
    private ServicesClusterMonitorHandler mockServicesClusterMonitorHandler;
    @Mock
    private SessionServiceURLService mockSessionServiceURLService;
    @Mock
    private SessionServerConfig mockServerConfig;
    @Mock
    private HttpConnectionFactory mockHttpConnectionFactor;

    @BeforeMethod
    public void setup() throws SessionException {
        MockitoAnnotations.initMocks(this);
        given(mockRequester.getID()).willReturn(mockRequesterId);
        given(mockSession.getID()).willReturn(mockSessionId);
        given(mockRequests.sendRequestWithRetry(
                any(URL.class),
                any(SessionRequest.class),
                any(Session.class))).willReturn(mockResponse);

        remoteOperations = new RemoteOperations(mock(Debug.class), mockRequests, mockServicesClusterMonitorHandler,
                mockSessionServiceURLService, mockServerConfig, mockHttpConnectionFactor);
    }

    @Test
    public void shouldUseSessionIDInRefreshRequest() throws SessionException {
        // Given
        SessionInfo mockSessionInfo = mock(SessionInfo.class);
        given(mockResponse.getSessionInfo()).willReturn(Arrays.asList(mockSessionInfo));

        // When
        SessionInfo result = remoteOperations.refresh(mockSession, true);

        // Then
        assertThat(result).isEqualTo(mockSessionInfo);
    }

    @Test
    public void shouldThrowExceptionIfRequestContainedOne() throws SessionException {
        // Given
        given(mockResponse.getException()).willReturn("Error");

        // When
        try {
            remoteOperations.refresh(mockSession, true);
        } catch (SessionException e) {
            // Then
            assertThat(e.getErrorCode()).isEqualTo(RemoteOperations.INVALID_SESSION_STATE);
        }
    }

    @Test
    public void shouldFailIfRequestDoesNotContainOneInfo() throws SessionException {
        // Given
        given(mockResponse.getSessionInfo()).willReturn(Arrays.asList(
                mock(SessionInfo.class),
                mock(SessionInfo.class)));

        // When
        try {
            remoteOperations.refresh(mockSession, true);
        } catch (SessionException e) {
            // Then
            assertThat(e.getErrorCode()).isEqualTo(RemoteOperations.UNEXPECTED_SESSION);
        }
    }

    @Test
    public void shouldUseRequestsForLogout() throws SessionException {
        // Given

        // When
        remoteOperations.logout(mockSession);

        // Then
        verify(mockRequests).sendRequestWithRetry(any(URL.class), any(SessionRequest.class), eq(mockSession));
    }

    @Test
    public void shouldUseRequestsForDestroy() throws SessionException {
        // Given

        // When
        remoteOperations.destroy(mockRequester, mockSession);

        // Then
        verify(mockRequests).sendRequestWithRetry(any(URL.class), any(SessionRequest.class), eq(mockSession));
    }

    @Test
    public void shouldUseRequestsForSetProperty() throws SessionException {
        // Given
        String name = "name";
        String value = "value";
        // When
        remoteOperations.setProperty(mockSession, name, value);

        // Then
        verify(mockRequests).sendRequestWithRetry(any(URL.class), any(SessionRequest.class), eq(mockSession));
    }
}
