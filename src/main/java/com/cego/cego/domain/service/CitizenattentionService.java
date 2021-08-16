package com.cego.cego.domain.service;

import com.cego.cego.domain.dto.Citizenattention;
import com.cego.cego.domain.repository.CitizenattentionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitizenattentionService {
    @Autowired
    private CitizenattentionRepository citizenattentionRepository;

    public List<Citizenattention> getAll(){
        return citizenattentionRepository.getAll();
    }

    public Optional<Citizenattention> getCitizenattention(int citizenattentionId){
        return citizenattentionRepository.getAtencionciudadano(citizenattentionId);
    }

}

