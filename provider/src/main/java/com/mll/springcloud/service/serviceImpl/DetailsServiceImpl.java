package com.mll.springcloud.service.serviceImpl;

import com.mll.pojo.Details;
import com.mll.springcloud.dao.DetailsDao;
import com.mll.springcloud.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class DetailsServiceImpl implements DetailsService {
    @Autowired
    private DetailsDao detailsDao;

    @Override
    public List<Details> detailsAll(Integer id) {//查询对应的商品详情信息
        return detailsDao.detailsAll(id);
    }
}
