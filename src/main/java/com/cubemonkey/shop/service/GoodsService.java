package com.cubemonkey.shop.service;

import com.cubemonkey.shop.model.Goods;

import java.util.List;

/**
 * @author CubeMonkey
 * @create 2020-08-18 14:47
 */
public interface GoodsService {
    Goods getGoods(Integer id);
    List<Goods> findAll();
    int insert(Goods goods);
    void deleteBatch(Long[] ids);
    void clearGoods();
}
