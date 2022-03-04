package com.backend.API.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProdutoDto {

    private String nome;
    private double valor;
    private Integer quantidade;
}
