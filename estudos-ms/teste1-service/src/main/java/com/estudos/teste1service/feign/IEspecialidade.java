package com.estudos.teste1service.feign;

import com.estudos.teste1service.dto.EspecialidadeDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//          nome do load balancer(lb), caminho específico do endpoint
@FeignClient(value = "teste2-service", path = "/service2/especialidades/")
public interface IEspecialidade {

    //identificador adicionado a URI(value + path) para buscar uma especialidade especifica
    @GetMapping("{id}")
    EspecialidadeDto getCompleteOneFeign(@PathVariable(name = "id") Long id);

}
