package com.example.vo.req;

import lombok.Data;

/**
 * @author Henry
 */
@Data
public abstract class TmsBaseRequest {

    private String traceId;

    private String channel;

    private String businessType;

    private Long tenantId;


}
