package com.cubemonkey.shop.service;

import com.cubemonkey.shop.dao.GoodsMapper;
import com.cubemonkey.shop.model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CubeMonkey
 * @create 2020-08-18 14:48
 */
@Service
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public Goods getGoods(Integer id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Goods> findAll() {
        return goodsMapper.findAll();
    }

    @Override
    public int insert(Goods goods) {
        return goodsMapper.insert(goods);
    }

    @Override
    public void deleteBatch(Long[] ids) {
        goodsMapper.deleteBatch(ids);
    }

    @Override
    public void clearGoods() {
        goodsMapper.clearGoods();
    }
}
