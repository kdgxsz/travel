package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Seller;

/**
 * 商家Dao
 * @author 尚郑
 */
public interface SellerDao {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Seller findById(int id);
}
