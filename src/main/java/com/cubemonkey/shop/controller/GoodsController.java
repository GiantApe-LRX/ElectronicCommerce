package com.cubemonkey.shop.controller;

import com.cubemonkey.shop.comm.BusinessException;
import com.cubemonkey.shop.comm.CommonRes;
import com.cubemonkey.shop.comm.EmBusinessError;
import com.cubemonkey.shop.model.Goods;
import com.cubemonkey.shop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * @author CubeMonkey
 * @create 2020-08-17 22:09
 */
@RequestMapping("/goods")
@RestController
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("/index.html");
        return modelAndView;
    }

    @RequestMapping("/get")
    @ResponseBody
    public CommonRes getGoods(@RequestParam(name="id") Integer id) throws BusinessException {
        Goods goods = goodsService.getGoods(id);
        if (goods != null) {
            return CommonRes.createCommonRes(goods, "success");
        }else{
            throw new BusinessException(EmBusinessError.NO_OBJECT_FOUND);
        }
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public CommonRes findAll() throws BusinessException {
        List<Goods> lists = goodsService.findAll();
        if (lists == null) {
            throw new BusinessException(EmBusinessError.NO_OBJECT_FOUND);
        }else {
            return  CommonRes.createCommonRes(lists);
        }
    }
    @RequestMapping(value = "/insertGoods", method = RequestMethod.POST)
    @ResponseBody
    public CommonRes insertGoods(Goods goods){
        int id = goodsService.insert(goods);
        return CommonRes.createCommonRes(id);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseBody
    public CommonRes delete(@RequestBody Long[] ids) throws BusinessException{
        goodsService.deleteBatch(ids);
        return CommonRes.createCommonRes("delete");
    }
    @RequestMapping(value = "/clearGoods",method = RequestMethod.POST)
    @ResponseBody
    public CommonRes clearGoods() throws BusinessException{
        goodsService.clearGoods();
        return CommonRes.createCommonRes("clear");
    }
}
