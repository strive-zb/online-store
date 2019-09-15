package com.creator.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum  ExceptionEnum {

    BRAND_NOT_FOUND(400, "品牌不存在"),
    CATEGORY_NOT_FOND(404,"商品分类未找到！"),
    ;
    private int code;
    private String msg;
}
