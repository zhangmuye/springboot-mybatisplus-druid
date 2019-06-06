package com.mybatisplus.mybatisplus.controller;


import com.mybatisplus.mybatisplus.entity.Department;
import com.mybatisplus.mybatisplus.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cw
 * @since 2019-06-06
 */
@RestController
@RequestMapping("/mybatisplus/department")
public class DepartmentController {

    @Autowired
    private IDepartmentService iDepartmentService;

    /**
     * 添加部门
     * 添加成功：输出成功提示
     * 添加失败：输出失败提示
     * @param departmentName
     * @param reps
     * @throws IOException
     */
    @GetMapping(value = "insert/{departmentName}")
    public void insertDepartment(@PathVariable(value = "departmentName")String departmentName,
                                 HttpServletResponse reps) throws IOException {

        Department department = new Department();
        department.setDepartmentName(departmentName);
        //添加部门
        boolean save = iDepartmentService.save(department);

        PrintWriter writer = reps.getWriter();
        writer.println(save ? "添夹部门信息成功！" : "添加失败！");
        //关闭资源
        writer.close();
    }
}

