package com.cego.cego.persistence.mapper;

import com.cego.cego.domain.dto.Citizenattention;
import com.cego.cego.persistence.entity.Atencionciudadano;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CitizenattentionMapper {

    @Mappings(

            {
                    @Mapping(source = "idAtencionciudadano",target = "atencionciudadanoId"),
                    @Mapping(source = "nombreUnidad",target = "nombreunidadId"),
                    @Mapping(source = "nombreGestor",target = "nombregestorId"),
                    @Mapping(source = "emailGestor",target = "emailgestorId"),
                    @Mapping(source = "direccionUnidad",target = "direccionunidadId"),
                    @Mapping(source = "ciudad",target = "ciudadId"),
                    @Mapping(source = "departamento",target = "departamentoId"),
            }
    )
    Citizenattention toAtencionciudadano(Atencionciudadano atencionciudadano);
    List<Citizenattention> toCitizenattentions(List<Atencionciudadano> atenciones);

    @InheritInverseConfiguration
    Atencionciudadano toAtencionciudadano(Citizenattention citizenattentions);

}
