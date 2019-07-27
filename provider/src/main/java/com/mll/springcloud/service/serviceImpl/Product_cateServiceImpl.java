package com.mll.springcloud.service.serviceImpl;

import com.mll.pojo.MLL_PRODUCT_CATEGORY;
import com.mll.springcloud.dao.Product_cateDao;
import com.mll.springcloud.service.Product_cateService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Product_cateServiceImpl implements Product_cateService {

    @Autowired
    private Product_cateDao pdao;


    @Override
    public List<MLL_PRODUCT_CATEGORY> findAll() {

        return pdao.findAll();

    }

}
