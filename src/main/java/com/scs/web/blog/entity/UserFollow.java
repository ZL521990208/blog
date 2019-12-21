package com.scs.web.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName UserFollow
 * @Description 关注用户实体
 * @Author zheng  liang
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserFollow {
    private Long id;
    private Long fromId;
    private Long toId;
}
