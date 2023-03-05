package com.berk.mapper;

import com.berk.dto.request.KisiSaveRequestDto;
import com.berk.repository.entity.Kisi;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IKisiMapper {
    IKisiMapper INSTANCE = Mappers.getMapper(IKisiMapper.class);

    Kisi toKisi(final KisiSaveRequestDto dto);
}
