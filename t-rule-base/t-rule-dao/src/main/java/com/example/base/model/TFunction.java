package com.example.base.model;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * f_function
 * @author 
 */
@Data
@TableName("t_function")
public class TFunction implements Serializable {

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
}