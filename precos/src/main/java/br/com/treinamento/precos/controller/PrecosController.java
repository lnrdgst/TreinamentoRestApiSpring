package br.com.treinamento.precos.controller;

import java.math.BigDecimal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinamento.precos.model.Preco;

@RestController
@RequestMapping("/precos")
public class PrecosController {
	
	@GetMapping("/{codigoProduto}")
	public ResponseEntity<Preco> obterPreco(@PathVariable Long codigoProduto){
		
		Preco preco = new Preco(codigoProduto, new BigDecimal(900));
		
		return ResponseEntity.ok(preco);
		
	}
	
}
