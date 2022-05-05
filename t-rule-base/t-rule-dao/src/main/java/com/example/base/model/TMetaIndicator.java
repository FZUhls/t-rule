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
@TableName("t_meta_indicator")
public class TMetaIndicator implements Serializable {
    /**
     * 自增主键
     */
    private Long id;

    /**
     * 元指标名
     */
    private String name;

    /**
     * 元指标code
     */
    private String metaIndicatorCode;

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