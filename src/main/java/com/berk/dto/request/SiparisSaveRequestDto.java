package com.berk.dto.request;

import com.berk.repository.enums.OdemeTuru;
import com.berk.repository.enums.SiparisTuru;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SiparisSaveRequestDto {
    Long kisiid;
    Long firmaid;
    @Enumerated(EnumType.STRING)
OdemeTuru odemeTuru;
@Enumerated(EnumType.STRING)
   SiparisTuru siparisTuru;
}
