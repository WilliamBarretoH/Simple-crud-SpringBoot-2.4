package com.backend.API.dto;

import com.backend.domain.entity.Produto;
import com.backend.domain.entity.User;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PedidoDto {

    private Long id;
    //private User user;
    private List<Produto> produtos;

}
