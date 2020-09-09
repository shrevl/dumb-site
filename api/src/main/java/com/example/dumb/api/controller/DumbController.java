package com.example.dumb.api.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

class DumbRequest { }

@Data
class DumbResponse {
    private final String message;
}

@RestController
public class DumbController {
    @ResponseBody
    @RequestMapping(value = "/dumb", method = RequestMethod.POST)
    public DumbResponse dumb(DumbRequest req) {
        return new DumbResponse("This is a D.U.M.B. response.");
    }
}
