package com.mybatisplus.mybatisplus.service.impl;

import com.mybatisplus.mybatisplus.entity.Department;
import com.mybatisplus.mybatisplus.mapper.DepartmentMapper;
import com.mybatisplus.mybatisplus.service.IDepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cw
 * @since 2019-06-06
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public boolean save(Department entity) {
        int num = departmentMapper.insert(entity);
        return num>0 ? true : false;
    }
}
