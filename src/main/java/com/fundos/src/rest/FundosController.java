package com.fundos.src.rest;

import com.fundos.src.entity.Fundos;
import com.fundos.src.repository.FundosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("fundos")
public class FundosController {

        @Autowired
        private FundosRepository fundosRepository;

        @RequestMapping(value = "/fundos", method = RequestMethod.GET)
        public List<Fundos> get() {
            return fundosRepository.findAll();
        }

        @RequestMapping(value = "/fundos/{id}", method = RequestMethod.GET)
        public ResponseEntity<Fundos> getById(@PathVariable(value = "id") Integer id)
        {
            Optional<Fundos> fundos = fundosRepository.findById(id);
            if(fundos.isPresent())
                return new ResponseEntity<Fundos>(fundos.get(), HttpStatus.OK);
            else
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        @RequestMapping(value = "/fundos", method =  RequestMethod.POST)
        public Fundos post(@Valid @RequestBody Fundos fundos)
        {
            return fundosRepository.save(fundos);
        }

        @RequestMapping(value = "/fundos/{id}", method =  RequestMethod.PUT)
        public ResponseEntity<Fundos> put(@PathVariable(value = "id") Integer id, @Valid @RequestBody Fundos novoFundo)
        {
            Optional<Fundos> oldFundo = fundosRepository.findById(id);
            if(oldFundo.isPresent()){
                Fundos fundos = oldFundo.get();
                fundosRepository.save(fundos);
                return new ResponseEntity<Fundos>(fundos, HttpStatus.OK);
            }
            else
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        @RequestMapping(value = "/fundos/{id}", method = RequestMethod.DELETE)
        public ResponseEntity<Object> delete(@PathVariable(value = "id") Integer id)
        {
            Optional<Fundos> fundos = fundosRepository.findById(id);
            if(fundos.isPresent()){
                fundosRepository.delete(fundos.get());
                return new ResponseEntity<>(HttpStatus.OK);
            }
            else
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
}

