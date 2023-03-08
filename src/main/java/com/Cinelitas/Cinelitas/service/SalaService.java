/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.Cinelitas.service;

import com.Cinelitas.Cinelitas.entity.Sala;
import com.Cinelitas.Cinelitas.repository.SalaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author menoc
 */
@Service
public class SalaService implements ISalaService {
    @Autowired
    private SalaRepository salaRepository;

    @Override
    public List<Sala> listSala() {
        return(List<Sala>)salaRepository.findAll();
    }
    
}
