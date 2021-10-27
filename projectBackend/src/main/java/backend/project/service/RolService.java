package backend.project.service;
import java.util.List;
import java.util.Optional;

import backend.project.entity.Rol;
import backend.project.repository.RolRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService
{
 @Autowired
    private RolRespository rolRespository;
    public List<Rol> BuscarTodos()
    {
        return (List<Rol>) rolRespository.findAll();
    }
    public Optional<Rol> getById(Integer id){
        return rolRespository.findById(id);
    }



}
