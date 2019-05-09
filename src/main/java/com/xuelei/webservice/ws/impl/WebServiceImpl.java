package com.xuelei.webservice.ws.impl;

import com.xuelei.webservice.ws.WebService;

@javax.jws.WebService
public class WebServiceImpl implements WebService {
    @Override
    public String hello() {
        return "hello webservice";
    }
}
