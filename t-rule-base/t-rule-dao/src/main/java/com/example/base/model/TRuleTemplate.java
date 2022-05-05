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
@TableName("t_rule_template")
public class TRuleTemplate implements Serializable {
    /**
     * 自增主键
     */
    private Long id;

    /**
     * 自然语言描述
     */
    private String title;

    /**
     * 因子个数
     */
    private Integer factorNum;
    /**
     * 创建时间
     */
    private Date creTime;

    /**
     * 更新时间
     */
    private Date updTime;
}