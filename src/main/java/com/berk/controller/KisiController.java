package com.berk.controller;

import com.berk.dto.request.KisiSaveRequestDto;
import com.berk.repository.entity.Kisi;
import com.berk.service.KisiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static com.berk.constants.EndPoints.*;
import static javax.websocket.Endpoint.*;

@RestController
@RequestMapping(API+VERSION+KISI)
@RequiredArgsConstructor
public class KisiController {
    private final KisiService kisiService;

    @PostMapping(SAVE)
    public ResponseEntity<Kisi> save(@RequestBody @Valid KisiSaveRequestDto dto){
        Kisi kisi = kisiService.saveDto(dto);
        return ResponseEntity.ok((kisi));
    }
}
