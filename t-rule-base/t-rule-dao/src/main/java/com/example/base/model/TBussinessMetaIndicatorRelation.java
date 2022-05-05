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
@TableName("t_bussiness_meta_indicator_relation")
public class TBussinessMetaIndicatorRelation implements Serializable {
    /**
     * 自增主键
     */
    private Long id;

    /**
     * 业务id
     */
    private Long businessId;

    /**
     * 元数据id
     */
    private Long metaIndicatorId;

    /**
     * 创建时间
     */
    private Date creTime;

    /**
     * 更新时间
     */
    private Date updTime;
}