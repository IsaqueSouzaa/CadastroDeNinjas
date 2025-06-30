package com.isaquebarbosa.CadastroDeNinjas.Missoes;

import com.isaquebarbosa.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table (name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String missao;

    private String dificuldade;

    // Uma missão pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    private NinjaModel ninjas;

}
