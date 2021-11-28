package br.com.treinamento.produtos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinamento.produtos.model.Produto;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> obterProduto(@PathVariable Long id){
		
		Produto produto = new Produto(id, "Ar condicionado", "gela demais");
		
		return ResponseEntity.ok(produto);
		
	}
	
	public ResponseEntity<Produto> criar(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(produto);
	}
	
	

}
