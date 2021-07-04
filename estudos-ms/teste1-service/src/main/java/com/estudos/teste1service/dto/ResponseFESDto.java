package com.estudos.teste1service.dto;

import com.estudos.teste1service.entity.FuncionarioEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Objeto de transferência para representar os dados completos, junção de varios ms
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseFESDto {

    private FuncionarioEntity funcionarioEntity;
    private EspecialidadeDto especialidadeDto;
    private SetorDto setorDto;
}
