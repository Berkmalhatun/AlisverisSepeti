package com.berk.repository;

import com.berk.repository.entity.Firma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFirmaRepository extends JpaRepository<Firma,Long> {
}
