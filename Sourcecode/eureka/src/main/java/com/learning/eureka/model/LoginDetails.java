package com.learning.eureka.model;

public class LoginDetails {
    String loginUrl;
    String authUrl;

    public LoginDetails(String authUrl, String loginUrl) {
        this.loginUrl=loginUrl;
        this.authUrl=authUrl;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getAuthUrl() {
        return authUrl;
    }

    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }
}
