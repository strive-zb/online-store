package com.creator.mapper;

import com.creator.domain.Category;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;


@Repository
public interface CategoryMapper extends Mapper<Category> {

}
