package com.creator.service;

import com.creator.common.vo.PageResult;
import com.creator.domain.Brand;

public interface IBrandService {


    PageResult<Brand> queryBrandByPage(Integer page, Integer rows, String sortBy, Boolean desc, String key);
}
