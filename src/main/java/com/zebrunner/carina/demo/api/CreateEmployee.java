package com.myapi.tests;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/api/v1/create", methodType = HttpMethodType.POST)
@ResponseTemplatePath(path = "api/create/_post/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class CreateEmployee extends AbstractApiMethodV2 {

    public CreateEmployee(String requestBody) {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url_dummyrestapi"));
        setRequestBody(requestBody);
    }
}
