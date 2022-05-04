package com.pharmacyapi.cspharma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharmacyapi.cspharma.model.Categoria;

	public interface CategoriaRepository extends JpaRepository <Categoria,Long> {
		public List<Categoria> findAllByNomeCategoriaContainingIgnoreCase(String nomeCategoria);
	}

