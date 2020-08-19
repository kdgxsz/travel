package cn.itcast.travel.service;

import cn.itcast.travel.domain.Favorite;

/**
 * 收藏
 * @author 尚郑
 */
public interface FavoriteService {

    /**
     * 判断是否收藏
     * @param rid
     * @param uid
     * @return
     */
    public boolean isFavorite(String rid , int uid);

    /**
     * 添加收藏
     * @param rid
     * @param uid
     */
    public void add(String rid, int uid);
}
