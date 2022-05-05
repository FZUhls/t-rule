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
@TableName("t_rule_template_factor_relation")
public class TRuleTemplateFactorRelation implements Serializable {
    /**
     * 自增主键
     */
    private Long id;

    /**
     * 自然语言描述
     */
    private String title;

    /**
     * 规则模板id
     */
    private Long ruleTemplateId;

    /**
     * 因子id
     */
    private Long factorId;

    /**
     * 序号
     */
    private Integer sortNo;

    /**
     * 创建时间
     */
    private Date creTime;

    /**
     * 更新时间
     */
    private Date updTime;
}