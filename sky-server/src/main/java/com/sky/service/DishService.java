package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * 菜品批量删除功能
     * @param ids
     */
    void deleteBatch(List<Long> ids);

    /**
     * 根据id来查询菜品的口味数据
     * @param id
     * @return
     */
    DishVO getByIdWithFlavor(Long id);

    /**
     * 根据id修稿菜品基本信息和对应的口味信息
     * @param dishDTO
     */
    void updataWithFlavor(DishDTO dishDTO);
}
