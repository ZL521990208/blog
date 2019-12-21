package com.scs.web.blog.domain.dto;

import lombok.Data;

/**
 * @ClassName SimpleTopic
 * @Description 简单的专题类，id、logo、名称
 * @Author zheng  liang
 **/
@Data
public class SimpleTopic {
    private Long id;
    private String topicName;
    private String logo;
}
