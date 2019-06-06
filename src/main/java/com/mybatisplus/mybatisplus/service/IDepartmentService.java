package com.mybatisplus.mybatisplus.service;

import com.mybatisplus.mybatisplus.entity.Department;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cw
 * @since 2019-06-06
 */
public interface IDepartmentService extends IService<Department> {
    @Override
    boolean save(Department entity);
}
