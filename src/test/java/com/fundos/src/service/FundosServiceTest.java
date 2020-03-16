package com.fundos.src.service;

import com.fundos.src.entity.Fundos;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
public class FundosServiceTest {

    FundosService fundosService;


    public void dadoId_DeveRetornarEntity() {

        List<Fundos> retorno = fundosService.getAllFundos();
        List<Fundos> expected = new ArrayList<Fundos>();
        assertEquals(expected,retorno);

    }

}