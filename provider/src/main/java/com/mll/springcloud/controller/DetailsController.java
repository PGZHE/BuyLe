package com.mll.springcloud.controller;

import com.mll.pojo.Details;
import com.mll.springcloud.serviceImpl.DetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DetailsController {
    @Autowired
    private DetailsServiceImpl dsic;

    @RequestMapping("/details/list/{id}")
    public List<Details> detailsAll(@PathVariable int id){
        id=1;
        return dsic.detailsAll(id);
    }
}
