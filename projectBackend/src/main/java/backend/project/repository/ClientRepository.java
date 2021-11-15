package backend.project.repository;

import backend.project.dto.ClientDto;
import backend.project.dto.MoreDto;
import backend.project.entity.Client;
import backend.project.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface  ClientRepository extends CrudRepository<Client, Integer> {

    @Query( "select new backend.project.dto.ClientDto( a.user_id,b.rol_id,a.username, b.name_rol , a.email, a.name, a.lastname) " +
            "from User a, Rol b  " +
            "where a.rol_id=b.rol_id and b.rol_id=0 ")
    List<ClientDto>ObtenerCliente();

}

