package com.zebrunner.carina.demo;


import com.zebrunner.carina.demo.DummyRestAPi.GetEmployeesMethod;
import com.zebrunner.carina.demo.DummyRestAPi.PostEmployeeMethod;
import com.zebrunner.carina.demo.api.DeleteEmployeeMethod;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class DummyApiTest implements IAbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test()
    @MethodOwner(owner = "dxliang")
    public void testGetEmployees() throws InterruptedException {
        GetEmployeesMethod getEmployeesMethod = new GetEmployeesMethod();
        getEmployeesMethod.callAPIExpectSuccess();
        getEmployeesMethod.validateResponse();
        Thread.sleep(5000);
    }

    @Test()
    @MethodOwner(owner = "dxliang")
    public void testPostEmployee() throws InterruptedException {
        PostEmployeeMethod postEmployeeMethod = new PostEmployeeMethod();
        postEmployeeMethod.setProperties("api/employees/employee.properties");
        postEmployeeMethod.callAPIExpectSuccess();
        postEmployeeMethod.validateResponse();
        Thread.sleep(10000);
    }

    @Test()
    @MethodOwner(owner = "dxliang")
    public void testDeleteEmployee() throws InterruptedException {
        DeleteEmployeeMethod deleteEmployeeMethod = new DeleteEmployeeMethod();
        deleteEmployeeMethod.callAPIExpectSuccess();
        deleteEmployeeMethod.validateResponse();
        Thread.sleep(15000);
    }
}
