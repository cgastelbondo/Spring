package com.cego.cego.domain.repository;

import com.cego.cego.domain.dto.Citizenattention;

import java.util.List;
import java.util.Optional;

public interface CitizenattentionRepository {
    List<Citizenattention> getAll();
    Optional<Citizenattention> getAtencionciudadano(int atencionciudadanoId);
}
