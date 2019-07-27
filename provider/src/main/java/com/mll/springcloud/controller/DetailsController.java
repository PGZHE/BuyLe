package com.mll.springcloud.controller;

import com.mll.pojo.Details;
import com.mll.pojo.MLL_PRODUCT_CATEGORY;
import com.mll.springcloud.service.Product_cateService;
import com.mll.springcloud.service.serviceImpl.DetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DetailsController {
    @Autowired
    private DetailsServiceImpl dsic;

//    @Autowired
//    private Product_cateService ps;
//
//    @RequestMapping("/product/all")
//    public List<MLL_PRODUCT_CATEGORY> findAll(){
//
//        return ps.findAll();
//    }

    @RequestMapping("/details/list/{id}")
    public List<Details> detailsAll(@PathVariable int id){
        id=2;
        return dsic.detailsAll(id);
    }
}
