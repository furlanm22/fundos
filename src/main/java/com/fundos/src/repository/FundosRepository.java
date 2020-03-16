package com.fundos.src.repository;

import com.fundos.src.entity.Fundos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.Table;

@Table
@Repository
public interface FundosRepository extends JpaRepository<Fundos, Integer>{

}

