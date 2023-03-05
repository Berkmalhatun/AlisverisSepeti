package com.berk.repository;


import com.berk.repository.entity.Kisi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IKisiRepository extends JpaRepository<Kisi,Long> {
}
