package com.cubemonkey.shop.dao;

import com.cubemonkey.shop.model.Goods;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    List<Goods> findAll();

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    void deleteBatch(Long[] ids);

    void clearGoods();
}