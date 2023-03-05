package com.berk.controller;

import com.berk.dto.request.FirmaSaveRequestDto;
import com.berk.repository.entity.Firma;
import com.berk.service.FirmaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static com.berk.constants.EndPoints.*;


@RestController
@RequestMapping(API+VERSION+FIRMA)
@RequiredArgsConstructor
public class FirmaController {
    private final FirmaService firmaService;

    @PostMapping(SAVE)
    public ResponseEntity<Firma> save(@RequestBody @Valid FirmaSaveRequestDto dto){
    Firma firma = firmaService.saveDto(dto);
    return ResponseEntity.ok((firma));
    }
}
