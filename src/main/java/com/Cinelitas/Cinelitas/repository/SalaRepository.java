/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.Cinelitas.repository;

import com.Cinelitas.Cinelitas.entity.Sala;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author menoc
 */
@Repository
public interface SalaRepository extends CrudRepository<Sala,Long>{
    
}