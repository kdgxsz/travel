package cn.itcast.travel.dao;

import cn.itcast.travel.domain.RouteImg;

import java.util.List;


/**
 * 查询图片
 * @author 尚郑
 */
public interface RouteImgDao {

    /**
     * 根据route的id查询图片
     * @param rid
     * @return
     */
    public List<RouteImg> findByRid(int rid);
}
