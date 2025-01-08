package com.sky.service.impl;

import com.sky.dto.DishDTO;
import com.sky.entity.Dish;
import com.sky.entity.DishFlavor;
import com.sky.mapper.DishFlavorMapper;
import com.sky.mapper.DishMapper;
import com.sky.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class DishServcelmpl implements DishService {

    @Autowired
    private DishMapper dishMapper;
    @Autowired
    private DishFlavorMapper dishFlavorMapper;

    /**
     * 新增菜品对应的口味
     * @param dishDTO
     */
    @Transactional //事务控制，保持一致性，要么全成功，要么全失败

    @Override
    public void savewithlavor(DishDTO dishDTO) {
        Dish dish = new Dish();

        BeanUtils.copyProperties(dishDTO,dish);
        //向菜品表插入一条数据
        dishMapper.insert(dish);
        //像口味表插入n条数据

        //获取insert语句生成的主键值
        Long dishId = dish.getId();
        List<DishFlavor> flavors = dishDTO.getFlavors();
        if (flavors != null && flavors.size() > 0){
            //遍历集合给id赋值
            flavors.forEach(dishFlavor -> {
                dishFlavor.setDishId(dishId);
            });
            //像口味表插入n条数据
            dishFlavorMapper.insertBatch(flavors);
        }
    }
}