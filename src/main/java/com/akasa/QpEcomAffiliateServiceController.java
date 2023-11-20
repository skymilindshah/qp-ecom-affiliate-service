package com.akasa;

import io.micronaut.http.annotation.*;

@Controller("/qp-ecom-affiliate-service")
public class QpEcomAffiliateServiceController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}