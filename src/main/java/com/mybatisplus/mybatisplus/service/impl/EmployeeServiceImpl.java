package com.mybatisplus.mybatisplus.service.impl;

import com.mybatisplus.mybatisplus.entity.Employee;
import com.mybatisplus.mybatisplus.mapper.EmployeeMapper;
import com.mybatisplus.mybatisplus.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cw
 * @since 2019-06-06
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Employee getById(Serializable id) {
        return super.getById(id);
    }
}
