package com.mybatisplus.mybatisplus.service.impl;

import com.mybatisplus.mybatisplus.entity.Department;
import com.mybatisplus.mybatisplus.mapper.DepartmentMapper;
import com.mybatisplus.mybatisplus.service.IDepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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

}
