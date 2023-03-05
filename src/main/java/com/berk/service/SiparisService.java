package com.berk.service;

import com.berk.dto.request.SiparisSaveRequestDto;
import com.berk.mapper.ISiparisMapper;
import com.berk.repository.ISiparisRepository;
import com.berk.repository.entity.Siparis;
import com.berk.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class SiparisService extends ServiceManager<Siparis,Long> {

    private final ISiparisRepository repository;

    public SiparisService(ISiparisRepository repository) {
        super(repository);
        this.repository = repository;
    }
    public Siparis saveDto(SiparisSaveRequestDto dto){
        return save(ISiparisMapper.INSTANCE.toSiparis(dto));
    }
}
