package com.joe.dejesus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joe.dejesus.model.Categoria;


//public interface CategoriasRepository extends CrudRepository<Categoria, Integer> 
public interface CategoriasRepository extends JpaRepository<Categoria, Integer>{

}