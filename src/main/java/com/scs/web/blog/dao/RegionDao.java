package com.scs.web.blog.dao;

import com.scs.web.blog.entity.Region;

import java.sql.SQLException;
import java.util.List;

/**
 * @author zheng  liang
 * @ClassName RegionDao
 * @Description RegionDao数据访问接口
 * @Version 1.0
 **/
public interface RegionDao {

    /**
     *  查询所有地址
     *
     * @return
     */
    List<Region> selectAll()throws SQLException;
}
