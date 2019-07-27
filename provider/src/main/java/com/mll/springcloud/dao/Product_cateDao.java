package com.mll.springcloud.dao;

import com.mll.pojo.MLL_PRODUCT_CATEGORY;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Product_cateDao {
    //查询所有
    public List<MLL_PRODUCT_CATEGORY> findAll();
}
