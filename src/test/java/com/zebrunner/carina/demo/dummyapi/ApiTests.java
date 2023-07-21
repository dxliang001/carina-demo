package com.zebrunner.carina.demo.dummyapi;


import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.demo.api.CreateEmployee;
import com.zebrunner.carina.demo.api.GetUserById;
import com.zebrunner.carina.demo.api.GetUserList;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTests {

    @Test
    public void testCreateEmployee() {
        String requestBody = "{ \"name\": \"John\", \"salary\": \"123\", \"age\": \"23\" }";
        CreateEmployee createEmployee = new CreateEmployee(requestBody);
        createEmployee.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rs = createEmployee.callAPI().asString();
        Assert.assertNotNull(rs, "The response is null!");
    }

    @Test
    public void testGetUserList() {
        GetUserList getUserList = new GetUserList();
        getUserList.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rs = getUserList.callAPI().asString();
        Assert.assertNotNull(rs, "The response is null!");
    }

    @Test
    public void testGetUserById() {
        GetUserById getUserById = new GetUserById("1");
        getUserById.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rs = getUserById.callAPI().asString();
        Assert.assertNotNull(rs, "The response is null!");
    }


}
