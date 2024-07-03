package com.example.simulado2024.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min= 10, max=100, message = "O endereço precisa ter no mínimo 10 caracteres!")
    private String endereco;

    private Tipo tipo;

    @Min(0)
    private double tamanho;

    @Min(0)
    private int numeroQuartos;

    @Min(0)
    private int numeroBanheiros;

    @Min(1)
    private double valor;

    private LocalDate dataCadastro;

    @ManyToOne
    private Proprietario proprietario;

}
