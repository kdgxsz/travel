package cn.itcast.travel.service;

import cn.itcast.travel.domain.Category;

import java.util.List;

/**
 * 导航栏service
 * @author 尚郑
 */
public interface CategoryService {

    public List<Category> findAll();
}
