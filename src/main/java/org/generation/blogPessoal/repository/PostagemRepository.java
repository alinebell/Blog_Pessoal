package org.generation.blogPessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import antlr.collections.List;

public interface PostagemRepository extends JpaRepository<PostagemModel, Long>{

	/**
	 * Method Query equivalente a instrução SQL: 
	 * 
	 * SELECT * FROM tb_postagem where titulo like "%titulo%";
	 */
	public List <PostagemModel> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}
