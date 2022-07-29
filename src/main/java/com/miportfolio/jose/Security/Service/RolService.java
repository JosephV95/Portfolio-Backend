package com.miportfolio.jose.Security.Service;

import com.miportfolio.jose.Security.Entity.Rol;
import com.miportfolio.jose.Security.Enums.RolNombre;
import com.miportfolio.jose.Security.Repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
@Transactional   //Lo que hace es que en caso de una caida de sistema los datos no se pierdan de la base de datos (es la Persistencia)
public class RolService {
    @Autowired
    IRolRepository iRolRepository; 
    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return iRolRepository.findByRolNombre(rolNombre);       
    }
    
    public void save (Rol rol) {
        iRolRepository.save(rol);
    }
}
