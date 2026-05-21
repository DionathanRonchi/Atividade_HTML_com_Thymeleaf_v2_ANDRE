package com.example.Atividade_HTML_com_Thymeleaf_v2.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioGamer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nickname;
    private String email;
    private String jogoFavorito;
    private Integer nivel;
}