package br.com.treinamento.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import br.com.treinamento.consumer.modal.ProdutoComPreco;
import reactor.core.publisher.Mono;

@Service
public class PrecoProdutoService {

	@Autowired
	public WebClient webClient;
	
	public ProdutoComPreco obterPorCodigo(Long codigoProduto) {
		Mono<ProdutoComPreco> monoProduto =  this.webClient
				.method(HttpMethod.GET)
				.uri("/produtos/{codigo}", codigoProduto)
				.retrieve()
				.bodyToMono(ProdutoComPreco.class);
		
		monoProduto.subscribe(p -> {
			System.out.println("Aqui sim finalizou realmente.");
		});
		
		System.out.println("Finalizou");

		return null;
	}

}
