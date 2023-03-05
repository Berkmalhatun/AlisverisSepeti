package com.berk.service;


import com.berk.dto.request.KisiSaveRequestDto;
import com.berk.mapper.IKisiMapper;
import com.berk.repository.IKisiRepository;
import com.berk.repository.entity.Kisi;
import com.berk.utility.ServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KisiService extends ServiceManager<Kisi,Long> {


    private final IKisiRepository repository;

    public KisiService(IKisiRepository repository){
        super(repository);
        this.repository = repository;
    }

    public Kisi saveDto(KisiSaveRequestDto dto) {
        return save(IKisiMapper.INSTANCE.toKisi(dto));
    }
}
