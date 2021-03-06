package com.scs.web.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author zheng  liang
 * @ClassName Topic
 * @Description TODO
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topic {
    private Long id;
    private Long adminId;
    private String topicName;
    private String logo;
    private String description;
    private String homepage;
    private Integer articles;
    private Integer follows;
    private LocalDateTime createTime;
}
