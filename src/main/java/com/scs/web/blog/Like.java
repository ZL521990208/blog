package com.scs.web.blog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @ClassName Like
 * @Description TODO
 * @Author zheng  liang
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Like {
    private Long id;
    private Long userId;
    private Long articleId;

}
