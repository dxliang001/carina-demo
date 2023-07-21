package com.zebrunner.carina.demo.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/user/create", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/user/_post/rq.json")
@ResponseTemplatePath(path = "api/user/_post/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.CREATED_201)
public class CreateUser extends AbstractApiMethodV2 {

    public CreateUser() {
        super("api/user/_post/rq.json", "api/user/_post/rs.json", "api/users/users.properties");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url_dummyapi"));
    }
}
