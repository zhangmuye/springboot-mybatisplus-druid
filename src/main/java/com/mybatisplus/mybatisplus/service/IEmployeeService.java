package com.mybatisplus.mybatisplus.service;

import com.mybatisplus.mybatisplus.entity.Employee;
import com.baomidou.mybatisplus.extension.service.IService;

import java.io.Serializable;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cw
 * @since 2019-06-06
 */
public interface IEmployeeService extends IService<Employee> {

    @Override
    Employee getById(Serializable id);
}
