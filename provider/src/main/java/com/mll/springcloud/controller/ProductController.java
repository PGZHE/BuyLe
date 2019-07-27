package com.mll.springcloud.controller;


import com.mll.pojo.MLL_PRODUCT_CATEGORY;
import com.mll.springcloud.service.Product_cateService;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private Product_cateService ps;

    @RequestMapping("/product/all")
   public List<MLL_PRODUCT_CATEGORY> findAll(){

      return ps.findAll();
   }

}
