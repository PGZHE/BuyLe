package com.mll.pojo;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MLL_PRODUCT_CATEGORY {


    private int mpc_id;//分类编号


    private String mpc_name;//分类名字

    private int parent_id;//父id


}
