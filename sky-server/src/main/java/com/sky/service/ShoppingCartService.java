package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;

import java.util.List;

/**
 * @version: java version 1.8
 * @Author: Mr Orange
 * @description:
 * @date: 2026-08-21 22:38
 */
public interface ShoppingCartService {

    /**
     * 添加购物车
     * @param shoppingCartDTO
     * @return
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);

    /**
     * 查看购物车
     * @return
     */
    List<ShoppingCart> showShoppingCart();

    /**
     * 删除购物车中一个商品
     * @param shoppingCartDTO
     * @return
     */
    void deleteShoppingCart(ShoppingCartDTO shoppingCartDTO);

    /**
     * 清空购物车
     * @return
     */
    void cleanShoppingCart();

}
