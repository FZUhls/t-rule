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
@TableName("t_rule_factor_value")
public class TRuleFactorValue implements Serializable {
    /**
     * 自增主键
     */
    private Long id;

    /**
     * 规则id
     */
    private Long ruleId;

    /**
     * 因子id
     */
    private Long factorId;

    /**
     * 值
     */
    private String value;

    /**
     * 创建时间
     */
    private Date creTime;

    /**
     * 更新时间
     */
    private Date updTime;

    private static final long serialVersionUID = 1L;
}