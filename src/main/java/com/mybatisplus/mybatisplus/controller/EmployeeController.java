package com.mybatisplus.mybatisplus.controller;


import com.mybatisplus.mybatisplus.entity.Employee;
import com.mybatisplus.mybatisplus.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cw
 * @since 2019-06-06
 */
@RestController
@RequestMapping("/mybatisplus/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService iEmployeeService;

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable(value = "id")int id){

        Employee byId = iEmployeeService.getById(id);

        return byId;
    }

}

