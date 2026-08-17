package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * @version: java version 1.8
 * @Author: Mr Orange
 * @description:
 * @date: 2026-08-17 22:20
 */
public interface DishService {

    /**
     * 新增菜品和对应的口味
     * @param dishDTO
     * @return
     */
    void saveWithFlavor(DishDTO dishDTO);

}
