package com.example.base.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * f_function
 * @author 
 */
@Data
public class TRuleIndicatorParamItem implements Serializable {
    /**
     * 自增主键
     */
    private Long id;

    /**
     * 函数名
     */
    private String functionName;

    /**
     * 函数类型
     */
    private String functionType;

    /**
     * 参数个数
     */
    private Integer paramNum;

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