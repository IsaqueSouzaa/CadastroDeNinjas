package com.isaquebarbosa.CadastroDeNinjas.Missoes;

import com.isaquebarbosa.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
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
