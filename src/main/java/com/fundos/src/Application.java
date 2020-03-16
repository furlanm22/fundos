package com.fundos.src;

import com.fundos.src.entity.Fundos;
import com.fundos.src.service.FundosService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

@SpringBootApplication
@EnableAutoConfiguration
public class Application implements CommandLineRunner{

	@Autowired
	FundosService fundosService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		Fundos fundo = new Fundos("BANCO DO BRASIL","1991","FC", "1%");
		fundosService.addFundo(fundo);

		List<Fundos> listFundos = fundosService.getAllFundos();
		for(Fundos fundos : listFundos)
		{
			System.out.println("Introducing Fundos => " + fundos);
		}
	}
}

