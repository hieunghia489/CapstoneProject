package com.code.secureridehome.mapper;

import com.code.secureridehome.model.entity.Passenger;
import com.code.secureridehome.model.request.PassengerRegister;
import org.hibernate.mapping.Map;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.Mapping;
@Mapper
public interface PassengerMapper {
    PassengerMapper INSTANCE= Mappers.getMapper(PassengerMapper.class);
    Passenger mapRequestToEntity(PassengerRegister register);
}
