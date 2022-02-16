
package com.tienda.repository;

import com.tienda.entity.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author XPC
 * Repositorio es el encargado de ir a la base de datos a consultar y traer la informacion y lo almacena en la identidad, la identidad mapea la informacion
 */
@Repository
public interface PaisRepository extends CrudRepository<Pais,Long> {
    
}
