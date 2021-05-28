package org.Generation.brogPessoal.repository;

import java.util.List;

import org.Generation.brogPessoal.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long >{
	
	public List<Tema>findAllByDescricaoContainingIgnoreCase(String descricao);

	

}
