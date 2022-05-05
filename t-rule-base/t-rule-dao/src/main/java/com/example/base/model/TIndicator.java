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
@TableName("t_indicator")
public class TIndicator implements Serializable {
    /**
     * 自增主键
     */
    private Long id;

    /**
     *指标类型
     */
    private String type;

    /**
     * 指标的自然语言描述
     */
    private String title;

    /**
     * 是否有条件
     */
    private String hasCondition;

    /**
     * 表达式
     */
    private String expression;

    /**
     * 创建时间
     */
    private Date creTime;

    /**
     * 更新时间
     */
    private Date updTime;
}