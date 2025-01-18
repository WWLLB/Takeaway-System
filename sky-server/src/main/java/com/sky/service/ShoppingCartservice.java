package com.sky.service;

import com.sky.dto.ShoppingCartDTO;

public interface ShoppingCartservice {

    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);
}
