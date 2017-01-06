package com.wqt.controller;

import com.wqt.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @ResponseBody
    @RequestMapping("/logins")
    public String login(String firstName){
        try{
            if(customerService.login(firstName)==true){
                return "true";
            };

        }catch (Exception e){
            e.printStackTrace();
        }
        return "false";
    }

}
