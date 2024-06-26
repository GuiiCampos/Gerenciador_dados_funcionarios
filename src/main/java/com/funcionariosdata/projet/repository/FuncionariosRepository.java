package com.funcionariosdata.projet.repository;

import com.funcionariosdata.projet.model.ModelFuncionarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Repositorio que extende as funções do Jpa
@Repository
public interface FuncionariosRepository extends JpaRepository<ModelFuncionarios,Integer> {
}
