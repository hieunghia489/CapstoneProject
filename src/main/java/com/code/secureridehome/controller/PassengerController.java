package com.code.secureridehome.controller;

import com.code.secureridehome.model.request.PassengerRegister;
import com.code.secureridehome.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PassengerController {
    private final PassengerService _service;
    @Autowired
    public PassengerController(PassengerService service){
        _service=service;
    }
 /*   @PostMapping
    public void registerPassenger(@RequestBody PassengerRegister passengerRequest){
        try{
            _service.registerPassenger(passengerRequest);
        }catch (Exception e){
            this.result.status= ResponseStatus.Status.FAILURE;
            this.result.message=e.getMessage();
        }
        return result;
    }*/
    }

