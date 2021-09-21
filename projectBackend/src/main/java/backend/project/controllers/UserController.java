package backend.project.controllers;

import backend.project.entity.User;
import backend.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user")

public class UserController {
    @Autowired
    private UserService userService;

    //GET para la obtencion de datos del usuario
    @GetMapping
    public List<User> userList(){
        return userService.listUser();
    }

    //GET para la obtencion de datos del usuario por id
    @GetMapping("/{userid}")
    public Optional<User> getByUserId(@PathVariable Integer userid){
        return (Optional<User>) userService.getByUserId(userid);
    }

    //Creacion  de usuarios
    @PostMapping
    public List<User> userCreate(){
        return userService.userCreation();
    }

    //Modificacion  de usuarios
    @PutMapping("/{userid}")
    public Optional<User> userUpdate(@PathVariable Integer userid) {
        return (Optional<User>) userService.userUpdate(userid);
    }

}
