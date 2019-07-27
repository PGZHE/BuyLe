package com.mll.pojo;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Details {//商品详情类
    private Integer mp_id;//商品编号
    private String mp_name;//商品名称
    private String mp_descpiption;//商品介绍
    private int mp_price;//商品价格
    private Integer mp_stock;//商品库存
    private Integer mpc_id;//一级菜单编号
    private String mp_file_name;//图片
    private Integer mp_special;//是否为特价商品(1代表是0代表不是)
    private String mp_file_image;//介绍轮播图片
    private String mp_file_special;//型号图片
    private String mp_wheelplanting_image;//详情轮播图片
    private String mp_tpwenzi;//型号文字介绍
    private String mp_image_xiangqing;//商品详情介绍图片
    private String mm_model;//商品型号
    private String mpr_price;//商品价格


}
