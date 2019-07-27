package com.mll.springcloud.servicer;

import com.mll.pojo.Details;
import com.mll.pojo.MLL_PRODUCT_CATEGORY;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("MICROSERVICE-MLL")//对应provider里面的appliction.yml文件中配置的微服务名
public interface DetailsService {

    @RequestMapping("/details/list/{id}")
    public List<Details> detailsAll(@PathVariable("id") Integer id);//查询对应的商品详情信息

    @RequestMapping("/product/all")
    public List<MLL_PRODUCT_CATEGORY> findAll();


}

