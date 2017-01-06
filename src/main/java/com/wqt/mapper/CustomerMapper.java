package com.wqt.mapper;

import com.wqt.dto.Customer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper {
    public Customer selectByName(@Param("firstName")String  firstName);
}
