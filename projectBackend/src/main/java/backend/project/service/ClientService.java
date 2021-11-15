package backend.project.service;

import backend.project.dto.CartDto;
import backend.project.dto.ClientDto;
import backend.project.dto.MoreDto;
import backend.project.entity.Cart;
import backend.project.repository.CartRepository;
import backend.project.repository.ClientRepository;
import backend.project.repository.MoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;



    public List<ClientDto> ObtenerCliente()
    {
        List<ClientDto> list= clientRepository.ObtenerCliente();
        list.forEach(l -> System.out.println(l));
        return list;

    }


}
