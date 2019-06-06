package com.mybatisplus.mybatisplus.mapper;

import com.mybatisplus.mybatisplus.entity.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.io.Serializable;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cw
 * @since 2019-06-06
 */
public interface EmployeeMapper extends BaseMapper<Employee> {

    @Override
    Employee selectById(Serializable id);
}
