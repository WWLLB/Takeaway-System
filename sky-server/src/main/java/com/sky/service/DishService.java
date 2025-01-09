package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
public interface DishService {

    /**
     * 新增菜品和对应口味值
     * @param dishDTO
     */
    public void savewithlavor(DishDTO dishDTO);


    /**
     *
     * 菜品分页查询方法
     * @param dishPageQueryDTO
     * @return
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);
}
