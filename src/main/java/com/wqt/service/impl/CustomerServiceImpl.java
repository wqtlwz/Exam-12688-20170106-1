package com.wqt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wqt.dto.Customer;
import com.wqt.mapper.CustomerMapper;
import com.wqt.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    CustomerMapper mapper;
    public boolean login( String firstName) {
        Customer customer = mapper.selectByName(firstName);
        if (customer!=null){
            return true;
        }else {
            return false;
        }
    }

}
