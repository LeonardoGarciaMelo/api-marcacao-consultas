package com.fiap.ecb.api_marcacao_consultas.service;

import com.fiap.ecb.api_marcacao_consultas.model.Especialidade;
import com.fiap.ecb.api_marcacao_consultas.repository.EspecialidadeRespository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecialidadeService {
    private final EspecialidadeRespository especialidadeRespository;
    public EspecialidadeService(EspecialidadeRespository especialidadeRespository){
        this.especialidadeRespository = especialidadeRespository;
    }
    public List<Especialidade> listarEspecialidades(){
        return especialidadeRespository.findAll();
    }
}
