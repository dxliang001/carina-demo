package com.zebrunner.carina.demo;

import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.demo.api.CreateEmployee;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DummyApiTest {

    @Test
    public void testCreateEmployee() {
        String requestBody = "{ \"name\": \"John\", \"salary\": \"123\", \"age\": \"23\" }";
        CreateEmployee createEmployee = new CreateEmployee(requestBody);
        createEmployee.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rs = createEmployee.callAPI().asString();
        Assert.assertNotNull(rs, "The response is null!");
    }

}