package com.fundos.src.service;

import com.fundos.src.entity.Fundos;
import com.fundos.src.repository.FundosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundosService {

    @Autowired
    FundosRepository fundosRepository;

    public List<Fundos> getAllFundos() {
        return this.fundosRepository.findAll();
    }

    public Fundos addFundo(Fundos fundo) {
        return this.fundosRepository.save(fundo);
    }

}