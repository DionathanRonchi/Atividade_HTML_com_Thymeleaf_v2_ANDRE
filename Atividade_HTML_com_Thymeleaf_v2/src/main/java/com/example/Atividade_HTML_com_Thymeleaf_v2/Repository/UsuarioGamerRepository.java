package com.example.Atividade_HTML_com_Thymeleaf_v2.repository;

import com.example.Atividade_HTML_com_Thymeleaf_v2.model.UsuarioGamer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioGamerRepository extends JpaRepository<UsuarioGamer, Long> {
}