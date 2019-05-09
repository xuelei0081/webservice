package com.xuelei.webservice.ws;

import javax.jws.WebMethod;

@javax.jws.WebService
public interface WebService {

    @WebMethod
    public String hello();
}
