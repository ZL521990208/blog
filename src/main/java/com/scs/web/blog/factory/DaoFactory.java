package com.scs.web.blog.factory;

import com.scs.web.blog.dao.*;
import com.scs.web.blog.dao.impl.*;

/**
 * @author zheng  liang
 * @ClassName DaoFactory
 * @Description Dao工厂类
 * @Version 1.0
 **/
public class DaoFactory {

    public static UserDao getUserDaoInstance() {
        return new UserDaoImpl();
    }

    public static ArticleDao getArticleDaoInstance() {
        return new ArticleDaoImpl();
    }

    public static TopicDao getTopicDaoInstance() {
        return new TopicDaoImpl();
    }

    public static RegionDao getRegionDaoInstance() {
        return new RegionDaoImpl();
    }

    public static LikeDao getLikeDaoInstance(){ return new LikeDaoimpl(); }

    public static CommentDao getCommentDaoInstance(){return  new CommentDaoimpl();}

    public  static TopicFollowDao getTopicFollowDaoInstance(){return  new TopicFollowDaoImpl();}

}
