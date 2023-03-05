package com.berk.mapper;

import com.berk.dto.request.SiparisSaveRequestDto;
import com.berk.repository.entity.Siparis;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ISiparisMapper {
    ISiparisMapper INSTANCE = Mappers.getMapper(ISiparisMapper.class);

    Siparis toSiparis(final SiparisSaveRequestDto dto);
}
