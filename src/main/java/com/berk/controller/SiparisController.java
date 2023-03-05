package com.berk.controller;


import static com.berk.constants.EndPoints.*;

import com.berk.dto.request.SiparisSaveRequestDto;
import com.berk.repository.entity.Siparis;
import com.berk.service.SiparisService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.websocket.Endpoint;

@RestController
@RequestMapping(API+VERSION+SIPARIS)
@RequiredArgsConstructor
public class SiparisController {
    private final SiparisService siparisService;

    @PostMapping(SIPARIS)
    public ResponseEntity<Siparis> save(@RequestBody @Valid SiparisSaveRequestDto dto){
        Siparis siparis = siparisService.saveDto(dto);
        return ResponseEntity.ok((siparis));
    }
}
