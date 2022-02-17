package com.momincong.controller;

import com.momincong.feign.EchoApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController implements EchoApi {

    @Override
    public String echo(String string) {
        return "echo from provider, message: " + string;
    }

}
