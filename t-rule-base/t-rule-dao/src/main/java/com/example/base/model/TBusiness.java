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
@TableName("t_business")
public class TBusiness implements Serializable {
    /**
     * 自增主键
     */
    private Long id;

    /**
     * 业务名
     */
    private String name;

    /**
     * 业务类型代号
     */
    private String categoryCode;

    /**
     * 业务代号
     */
    private String businessCode;

    /**
     * 创建时间
     */
    private Date creTime;

    /**
     * 更新时间
     */
    private Date updTime;
}