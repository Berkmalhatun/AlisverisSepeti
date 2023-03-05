package com.berk.repository;


import com.berk.repository.entity.Siparis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISiparisRepository extends JpaRepository<Siparis,Long> {

}

