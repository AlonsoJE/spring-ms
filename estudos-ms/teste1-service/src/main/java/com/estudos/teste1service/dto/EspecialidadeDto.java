package com.estudos.teste1service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Objeto de transferência para representar dados de outro ms
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EspecialidadeDto {

    private Long id;
    private String nome;

}
