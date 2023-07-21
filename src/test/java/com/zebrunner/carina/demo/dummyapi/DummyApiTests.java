package com.zebrunner.carina.demo.dummyapi;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.demo.api.CreateUser;
import com.zebrunner.carina.demo.api.DeleteUserById;
import com.zebrunner.carina.demo.api.GetUserList;
import com.zebrunner.carina.utils.config.Configuration;
import org.testng.annotations.Test;

public class DummyApiTests {

    @Test
    public void testCreateUser() {
        CreateUser api = new CreateUser();
        api.callAPIExpectSuccess();
        api.validateResponse();
    }

    @Test
    public void testGetUserList() {
        GetUserList api = new GetUserList();
        api.callAPIExpectSuccess();
        api.validateResponse();
    }

    @Test
    public void testDeleteUserById() {
        String userId = "60d0fe4f5311236168a109ca"; // replace with actual user ID
        DeleteUserById api = new DeleteUserById(userId);
        api.callAPIExpectSuccess();
        api.validateResponse();
    }
}
