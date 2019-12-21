package com.scs.web.blog.factory;

import com.scs.web.blog.entity.Comment;
import com.scs.web.blog.entity.TopicFollow;
import com.scs.web.blog.service.*;
import com.scs.web.blog.service.impl.*;

/**
 * @author zheng  liang
 * @ClassName ServiceFactory
 * @Description Service工厂类
 * @Version 1.0
 **/
public class ServiceFactory {
    public static UserService getUserServiceInstance() {
        return new UserServiceImpl();
    }

    public static ArticleService getArticleServiceInstance() {
        return new ArticleServiceImpl();
    }

    public static TopicService getTopicServiceInstance() {
        return new TopicServiceImpl();
    }

    public static CommentService getCommentServiceINstance(){return  new CommentServiceImpl(); }

    public static TopicFollowService getTopicFollowServiceInstance(){return  new TopicFollowServiceImpl(); }
}
