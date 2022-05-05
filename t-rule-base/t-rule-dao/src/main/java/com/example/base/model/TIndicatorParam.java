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
@TableName("t_indicator_param")
public class TIndicatorParam implements Serializable {
    /**
     * 自增主键
     */
    private Long id;

    /**
     * 指标id
     */
    private Long indicatorId;

    /**
     * 条件名
     */
    private Long conditionName;

    /**
     * 条件类型
     */
    private String conditionType;

    /**
     * 序号
     */
    private Integer sort;

    /**
     * 创建时间
     */
    private Date creTime;

    /**
     * 更新时间
     */
    private Date updTime;
}