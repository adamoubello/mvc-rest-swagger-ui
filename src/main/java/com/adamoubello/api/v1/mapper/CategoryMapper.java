package com.adamoubello.api.v1.mapper;

import com.adamoubello.api.v1.model.CategoryDTO;
import com.adamoubello.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
}
