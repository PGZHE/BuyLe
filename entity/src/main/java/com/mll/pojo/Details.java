package com.mll.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Details {//商品详情类
    public Integer mp_id;//商品编号
    public String mp_name;//商品名称
    public String mp_descpiption;//商品介绍
    public double mp_price;//商品价格
    public Integer mp_stock;//商品库存
    public Integer mpc_id;//一级菜单编号
    public String mp_file_name;//图片
    public Integer mp_special;//是否为特价商品(1代表是0代表不是)
}
