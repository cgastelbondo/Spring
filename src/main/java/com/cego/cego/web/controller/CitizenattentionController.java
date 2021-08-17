package com.cego.cego.web.controller;

import com.cego.cego.domain.dto.Citizenattention;
import com.cego.cego.domain.service.CitizenattentionService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Citizenattentions")
public class CitizenattentionController {
    @Autowired
    private CitizenattentionService citizenattentionService;

    @ApiOperation("Retorna toda la informacion almacenada")
    @GetMapping("/all")
    public List<Citizenattention> getAll(){
        return citizenattentionService.getAll();
    }

    @ApiOperation("Retorna la informacion del Id requerido")
    @GetMapping("/{id}")
    public Optional<Citizenattention> getCitizenattention(@ApiParam(value="Identificador de atencion al ciudadano", required = true, example="9") @PathVariable("id") Integer atencionId){
        return citizenattentionService.getCitizenattention(atencionId);

    }



}
