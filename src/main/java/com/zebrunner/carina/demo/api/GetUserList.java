package com.zebrunner.carina.demo.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/user", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/user/_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetUserList extends AbstractApiMethodV2 {
    public GetUserList() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url_dummyapi"));
        addProperty("app-id", "0JyYiOQXQQr5H9OEn21312"); // replace <your-app-id> with your actual app id
    }
}
