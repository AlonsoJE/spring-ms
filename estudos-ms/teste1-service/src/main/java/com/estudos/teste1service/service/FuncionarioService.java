package com.estudos.teste1service.service;

import com.estudos.teste1service.dto.EspecialidadeDto;
import com.estudos.teste1service.dto.ResponseFESDto;
import com.estudos.teste1service.dto.SetorDto;
import com.estudos.teste1service.entity.FuncionarioEntity;
import com.estudos.teste1service.feign.IEspecialidade;
import com.estudos.teste1service.feign.ISetor;
import com.estudos.teste1service.repository.FuncionarioRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
@Log4j2
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    //injeta o @bean de restTemplate
    @Autowired
    private RestTemplate restTemplate;

    //injeta o feign client de especialidade
    @Autowired
    private IEspecialidade especialidade;

    //injeta o feign client de Setor
    @Autowired
    private ISetor setor;

    public FuncionarioEntity save(FuncionarioEntity entity){
        log.info("FuncionarioService : save(entity)");
        return repository.save(entity);
    }

    public List<FuncionarioEntity> findAll(){
        log.info("FuncionarioService : findAll()");
        return repository.findAll();
    }

    public Optional<FuncionarioEntity> findOne(Long id){
        log.info("FuncionarioService : findOne(id)");
        return repository.findById(id);
    }

    //usando RestTemplate
    public ResponseFESDto getCompleteOne(Long id) {
        log.info("FuncionarioService : getCompleteOne(id)");

        FuncionarioEntity funcionarioEntity = repository.findById(id).get();

        //consumindo o ms2, informando o load balance referente ao ms ao invés de passar o endereço hard coded
        EspecialidadeDto especialidadeDto = restTemplate.getForObject(String.format("http://teste2-service/service2/especialidades/%s", funcionarioEntity.getEspecialidadeId())
                , EspecialidadeDto.class);

        //consumindo o ms3, informando o load balance referente ao ms ao invés de passar o endereço hard coded
        SetorDto setorDto = restTemplate.getForObject(String.format("http://teste3-service/service3/setores/%s", funcionarioEntity.getSetorId()), SetorDto.class);

        return new ResponseFESDto(funcionarioEntity, especialidadeDto, setorDto);
    }

    //usando OpenFeign
    public ResponseFESDto getCompleteOneWithFeign(Long id) {
        log.info("FuncionarioService : getCompleteOneWithFeign(id)");

        FuncionarioEntity funcionarioEntity = repository.findById(id).get();

        //consumindo o ms2 e ms3 através da interface do OpenFeignClient
        EspecialidadeDto especialidadeDto = especialidade.getCompleteOneFeign(funcionarioEntity.getEspecialidadeId());
        SetorDto setorDto = setor.getCompleteOneFeign(funcionarioEntity.getSetorId());

        return new ResponseFESDto(funcionarioEntity, especialidadeDto, setorDto);
    }
}
