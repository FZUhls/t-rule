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
@TableName("t_factor")
public class TFactor implements Serializable {
    /**
     * 自增主键
     */
    private Long id;

    /**
     * 指标id
     */
    private Long indicatorId;

    /**
     * 运算符
     */
    private String operator;

    /**
     * 值域类型
     */
    private String valueType;

    /**
     * 创建时间
     */
    private Date creTime;

    /**
     * 更新时间
     */
    private Date updTime;
}