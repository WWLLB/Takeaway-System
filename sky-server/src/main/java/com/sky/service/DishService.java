package com.sky.service;

import com.sky.dto.DishDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
public interface DishService {

    /**
     * 新增菜品和对应口味值
     * @param dishDTO
     */
    public void savewithlavor(DishDTO dishDTO);


}
