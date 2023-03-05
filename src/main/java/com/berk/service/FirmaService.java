package com.berk.service;

import com.berk.dto.request.FirmaSaveRequestDto;
import com.berk.mapper.IFirmaMapper;
import com.berk.repository.IFirmaRepository;
import com.berk.repository.entity.Firma;
import com.berk.repository.entity.Kisi;
import com.berk.utility.ServiceManager;
import org.springframework.stereotype.Service;


@Service
public class FirmaService extends ServiceManager<Firma,Long> {

    private final IFirmaRepository repository;

    public FirmaService(IFirmaRepository repository){
    super(repository);
    this.repository = repository;
    }
    public Firma saveDto(FirmaSaveRequestDto dto){
        return save(IFirmaMapper.INSTANCE.toFirma(dto));
    }
}
