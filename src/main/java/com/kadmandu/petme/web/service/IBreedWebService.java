package com.kadmandu.petme.web.service;

import java.util.List;

import com.kadmandu.petme.web.base.IBaseWebService;
import com.kadmandu.petme.web.entity.AnimalDTO;
import com.kadmandu.petme.web.entity.BreedDTO;

/**
 * Interface containing the operations to perform as an entry point for breeds
 * 
 * @author German Potes
 */
public interface IBreedWebService extends IBaseWebService<BreedDTO> {

    List<BreedDTO> getByAnimal(final AnimalDTO animalDto);
}
