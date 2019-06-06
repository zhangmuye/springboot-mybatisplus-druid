package com.mybatisplus.mybatisplus.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author cw
 * @since 2019-06-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Employee implements Serializable {

private static final long serialVersionUID=1L;
    @TableId("id")
    private int id;

    private String lastName;

    private String email;

    private Integer gender;

    private Integer dId;


}
