package com.berk.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KisiSaveRequestDto {
    String isim;
    String soyisim;
    String email;
    String adres;
}
