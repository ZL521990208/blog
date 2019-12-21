package com.scs.web.blog.domain.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zheng  liang
 * @ClassName UserDto
 * @Description 用户传输对象
 * @Version 1.0
 **/
@Data
public class UserDto implements Serializable {
    private String mobile;
    private String password;
    private String code;

}
