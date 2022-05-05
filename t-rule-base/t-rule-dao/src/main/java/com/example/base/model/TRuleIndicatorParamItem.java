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
@TableName("t_rule_indicator_param_item")
public class TRuleIndicatorParamItem implements Serializable {
    /**
     * 自增主键
     */
    private Long id;

    /**
     * 规则id
     */
    private Long ruleId;

    /**
     * 参数项id
     */
    private Long indicatorParamId;

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
}