package com.fiap.ecb.api_marcacao_consultas.repository;

import com.fiap.ecb.api_marcacao_consultas.model.Especialidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EspecialidadeRespository extends JpaRepository<Especialidade, Long> {
}
