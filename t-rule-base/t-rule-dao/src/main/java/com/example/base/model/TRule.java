package com.example.base.model;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * f_function
 * @author 
 */
@Data
@TableName("t_rule")
public class TRule implements Serializable {
    /**
     * 自增主键
     */
    private Long id;

    private Long ruleId;

    private Long templateId;

    private String title;

    private String status;

    /**
     * 创建时间
     */
    private Date creTime;

    /**
     * 更新时间
     */
    private Date updTime;
}