package com.bootcamp.tecnologia.infrastructure.adapters.persistenceadapter.mapper;

import com.bootcamp.tecnologia.domain.model.User;
import com.bootcamp.tecnologia.infrastructure.adapters.persistenceadapter.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "email", target = "email")
    User toModel(UserEntity entity);
    UserEntity toEntity(User user);
}
