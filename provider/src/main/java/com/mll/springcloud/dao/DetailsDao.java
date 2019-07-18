package com.mll.springcloud.dao;

import com.mll.pojo.Details;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface DetailsDao {
    public List<Details> DetailsSelectAll(@Param("id") Integer id);//查询指定商品详情
}
