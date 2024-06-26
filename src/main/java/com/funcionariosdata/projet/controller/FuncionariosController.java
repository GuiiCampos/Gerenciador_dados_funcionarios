package com.funcionariosdata.projet.controller;

import com.funcionariosdata.projet.model.ModelFuncionarios;
import com.funcionariosdata.projet.service.FuncionariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Classe controle
@RestController
@RequestMapping("/api/dadosfuncionarios") //link para acessar a Api
public class FuncionariosController {

    //variável para acessar a classe service
    @Autowired
    private FuncionariosService funcionariosService;

    //Endpoint para ver todos os funcionários (Get)
    @GetMapping
    public List<ModelFuncionarios> getFuncionarios() {
        return funcionariosService.getAllFuncionarios();
    }

    //Endpoint para ver um funcionário específico atráves do seu Id (Get)
    @GetMapping("/{id}")
    public ResponseEntity<ModelFuncionarios> getFuncionario(@PathVariable int id) {
        return funcionariosService.getFuncionarioId(id).map(ResponseEntity :: ok).orElse(ResponseEntity.notFound().build());
    }

    //Endpoint para inserir um funcionário (Post)
    @PostMapping
    public ModelFuncionarios postFuncionario(@RequestBody ModelFuncionarios funcionario) {
        return funcionariosService.insereFuncionario(funcionario);
    }

    //Endpoint para atualizar os dados de algum funcionário pelo ID (Put)
    @PutMapping("/{id}")
    public ResponseEntity updateFuncionario(@PathVariable int id, @RequestBody ModelFuncionarios funcionarioDetalhes) {
        return ResponseEntity.ok(funcionariosService.updateFuncionarios(id, funcionarioDetalhes));
    }

    //Endpoint para deletar um funcionário específico pelo ID (Delete)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFuncionario(@PathVariable int id) {
        funcionariosService.deleteFuncionarios(id);
        return ResponseEntity.noContent().build();
    }

}
