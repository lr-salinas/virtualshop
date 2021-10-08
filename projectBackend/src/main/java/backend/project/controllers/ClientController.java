package backend.project.controllers;

import backend.project.entity.Client;
import backend.project.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/client")

public class ClientController {

    @Autowired
    private ClientService clientService;

    //GET para la obtencion de datos del cliente
    @GetMapping
    public List<Client> ClientList(){
        return clientService.ListClient();
    }

    //GET para la obtencion de datos del cliente por id
    @GetMapping("/{id}")
    public Optional<Client> getByClientId(@PathVariable Integer id){
        return clientService.SearchClient(id);
    }

    //	AGREGAR UN NUEVO USUARIO
    @PostMapping
    public ResponseEntity<Client> SaveClient(@RequestBody Client entityClient){
        return new ResponseEntity<Client>(clientService.SaveClient(entityClient),
                HttpStatus.CREATED);
    }

    //Borrar un usuario
    @DeleteMapping("/{id}")
    public void DeleteClient(@PathVariable int id){
        clientService.DeleteClient(id);
    }

    @PutMapping("/{id}")
    public Client UpdateClient(@RequestBody Client entityClient,@PathVariable int id){
        return clientService.UpdateClient(id,entityClient);
    }



}
