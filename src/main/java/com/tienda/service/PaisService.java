
package com.tienda.service;

import com.tienda.entity.Pais;
import com.tienda.repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisService implements IPaisService {

    //Inyteccion de dependencias
    @Autowired
    private PaisRepository paisRepository;
    @Override
    public List<Pais> listCountry() {
      return (List<Pais>) paisRepository;
    }
    
}