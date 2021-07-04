package com.estudos.teste1service.feign;

import com.estudos.teste1service.dto.SetorDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "teste3-service", path = "/service3/setores/")
public interface ISetor {

    @GetMapping("{id}")
    SetorDto getCompleteOneFeign(@PathVariable(name = "id") Long id);

}
