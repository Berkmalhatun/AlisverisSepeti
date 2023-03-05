package com.berk.repository.entity;

import com.berk.repository.enums.Icerik;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tblfirma")
public class Firma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String isim;
    @ElementCollection
    List<Icerik> tur;
    String logo;
    String aciklama;
    Double minTutar;
    String il;
    Long puan;
}
