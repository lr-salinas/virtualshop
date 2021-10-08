package backend.project.service;

import backend.project.entity.Client;
import backend.project.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> ListClient(){
        return (List<Client>) clientRepository.findAll();
    }

    public Optional<Client> SearchClient(int id){
        return clientRepository.findById(id);
    }

    public Client SaveClient(Client client){
        return clientRepository.save(client);
    }

    public void DeleteClient(int id){
        clientRepository.deleteById(id);
    }

    public Client UpdateClient(int id, Client clientUpdate) {
        Client clientReturn = new Client();
        Optional<Client> u = clientRepository.findById(id);

        if(u.isPresent()){
            clientReturn = u.get();
            clientReturn = clientUpdate;
            clientRepository.save(clientReturn);
        }
        return clientReturn;
    }


}
