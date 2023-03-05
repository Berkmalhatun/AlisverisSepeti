package com.berk.repository.entity;

import com.berk.repository.enums.Cinsiyet;
import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tblkisi")
public class Kisi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String isim;
    String soyisim;
    String email;
    Cinsiyet cinsiyet;
    int yas;
    String adres;
}
