package com.berk.repository.entity;
import com.berk.repository.enums.OdemeTuru;
import com.berk.repository.enums.SiparisTuru;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tblsiparis")
public class Siparis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long kisiid;
    Long firmaid;
/* @Enumerated(EnumType.STRING)*/
    OdemeTuru odemeTuru;
/*  @Enumerated(EnumType.STRING)*/
    SiparisTuru siparisTuru;
}
