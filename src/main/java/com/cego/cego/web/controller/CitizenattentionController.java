package com.cego.cego.web.controller;

import com.cego.cego.domain.dto.Citizenattention;
import com.cego.cego.domain.service.CitizenattentionService;
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

    @GetMapping("/all")
    public List<Citizenattention> getAll(){
        return citizenattentionService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Citizenattention> getCitizenattention(@PathVariable("id") Integer atencionId){
        return citizenattentionService.getCitizenattention(atencionId);

    }

}
