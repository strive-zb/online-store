package com.creator.service;

import com.creator.domain.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> queryCategoryListByPid(Long pid);
}
