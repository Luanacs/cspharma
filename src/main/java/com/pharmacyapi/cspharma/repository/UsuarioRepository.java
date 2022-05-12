package com.pharmacyapi.cspharma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.pharmacyapi.cspharma.model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario,Long>{
	
	public List<Usuario>findByNomeContainingIgnoreCase(@Param ("nome") String nome);
	public List<Usuario>findByCpf(@Param ("cpf") String cpf);
}
