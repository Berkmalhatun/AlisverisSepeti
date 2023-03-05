package com.berk.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FirmaSaveRequestDto {
    String isim;
    String logo;
    String aciklama;
    String il;
    Double minTutar;
}
