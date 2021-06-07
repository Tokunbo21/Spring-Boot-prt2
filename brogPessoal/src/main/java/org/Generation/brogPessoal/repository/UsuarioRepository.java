package org.Generation.brogPessoal.repository;

import java.util.Optional;

import org.Generation.brogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{
	
	public Optional<Usuario> findByUsuario(String usuarion);

}
