package com.cego.cego.persistence;

import com.cego.cego.domain.dto.Citizenattention;
import com.cego.cego.domain.repository.CitizenattentionRepository;
import com.cego.cego.persistence.crud.AtencionciudadanoCrudRepository;
import com.cego.cego.persistence.entity.Atencionciudadano;
import com.cego.cego.persistence.mapper.CitizenattentionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AtencionciudadanoRepository implements CitizenattentionRepository {
    @Autowired
    private AtencionciudadanoCrudRepository AtencionciudadanoCrudRepository;
    @Autowired
    private CitizenattentionMapper Mapper;

    @Override
    public List<Citizenattention> getAll(){
        List<Atencionciudadano> atenciones = (List<Atencionciudadano>)AtencionciudadanoCrudRepository.findAll();
        return Mapper.toCitizenattentions(atenciones);
    }

    @Override
    public Optional<Citizenattention> getAtencionciudadano(int IdAtencionciudadano) {
        return AtencionciudadanoCrudRepository.findById(IdAtencionciudadano).map(atencionciudadano -> Mapper.toAtencionciudadano(atencionciudadano));
    }

}
