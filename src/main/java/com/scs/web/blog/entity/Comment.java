package com.scs.web.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @ClassName Comment
 * @Description TODO
 * @Author zheng  liang
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private Long id;
    private Long userId;
    private Long articleId;
    private String content;
    private LocalDateTime createTime;
}
