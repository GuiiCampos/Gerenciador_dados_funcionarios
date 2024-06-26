package com.funcionariosdata.projet.service;

import com.funcionariosdata.projet.model.ModelFuncionarios;
import com.funcionariosdata.projet.repository.FuncionariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//classe que gerencia a lógica do Crud
@Service
public class FuncionariosService {

    //Variável que acessa o repositório
    @Autowired
    private FuncionariosRepository funcionariosRepository;

    //Função que retorna todos os dados do banco de dados (Get)
    public List<ModelFuncionarios> getAllFuncionarios() {
        return funcionariosRepository.findAll();
    }

    //Função que retorna algum funcionário atráves do Id (Get)
    public Optional<ModelFuncionarios> getFuncionarioId(int id) {
        return funcionariosRepository.findById(id);
    }

    //Função que insere um funcionário no banco de dados (Post)
    public ModelFuncionarios insereFuncionario(ModelFuncionarios funcionario) {
        return funcionariosRepository.save(funcionario);
    }

    //Função que atualiza os dados de um funcionário atráves do Id (Put)
    public ModelFuncionarios updateFuncionarios(int id, ModelFuncionarios funcionariosDetalhes) {
        ModelFuncionarios funcionarios = funcionariosRepository.findById(id).orElseThrow();
        funcionarios.setNome(funcionariosDetalhes.getNome());
        funcionarios.setAlergias(funcionariosDetalhes.getAlergias());
        funcionarios.setProblemasMedicos(funcionariosDetalhes.getProblemasMedicos());
        funcionarios.setTelefone(funcionariosDetalhes.getTelefone());
        funcionarios.setEmail(funcionariosDetalhes.getEmail());
        return funcionariosRepository.save(funcionarios);
    }

    //Função que deleta um funcionário atráves do Id (Delete)
    public void deleteFuncionarios(int id) {
        funcionariosRepository.deleteById(id);
    }
}
