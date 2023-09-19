package com.generation.rcfarma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.rcfarma.model.Categoria;
import com.generation.rcfarma.model.Produto;

public interface ProdutoRepository extends JpaRepository <Produto,Long> {

	static List<Produto> findByCategoria(Categoria categoria) {
		List<Produto> produtos = ProdutoRepository.findByCategoria(categoria);
	    
	    return produtos;
	}

	static List<Produto> findAllByNomeContainingIgnoreCase(String nome) {
		List<Produto> produtos = ProdutoRepository.findAllByNomeContainingIgnoreCase(nome);  
	    return produtos;
	}


}