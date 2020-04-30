package com.xxl.sso.sample.config.shiro;

import org.apache.shiro.authc.AuthenticationToken;

public class SsoToken implements AuthenticationToken {

    public SsoToken(String sessionId) {
        this.sessionId = sessionId;
    }

    private String sessionId;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public Object getPrincipal() {
        return sessionId;
    }

    @Override
    public Object getCredentials() {
        return sessionId;
    }
}