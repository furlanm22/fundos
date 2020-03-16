package com.fundos.src.rest;


import com.fundos.src.entity.Fundos;
import com.fundos.src.repository.FundosRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class FundosControllerTest {

    private FundosController fundosController;

    public void dadoId_DeveRetornarEntity() {

        ResponseEntity<Fundos> retorno = fundosController.getById(1);
        ResponseEntity<Fundos> nexpected = null;
        assertNotEquals(nexpected,retorno);

    }
    public void dadaChamaAll_DeveRetornarEntity() {

        List<Fundos> retorno = fundosController.get();
        List<Fundos> expected = new ArrayList<Fundos>();
        assertEquals(expected,retorno);

    }
}

