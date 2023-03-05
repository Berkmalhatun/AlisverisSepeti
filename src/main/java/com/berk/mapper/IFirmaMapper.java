package com.berk.mapper;

import com.berk.dto.request.FirmaSaveRequestDto;
import com.berk.repository.entity.Firma;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IFirmaMapper {

    IFirmaMapper INSTANCE = Mappers.getMapper(IFirmaMapper.class);

    Firma toFirma(final FirmaSaveRequestDto dto);
}
