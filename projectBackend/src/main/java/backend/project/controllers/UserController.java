package backend.project.controllers;

import backend.project.entity.User;
import backend.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;
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
    public List<User> UserList(){
        return userService.ListUser();
    }

    //GET para la obtencion de datos del usuario por id
    @GetMapping("/{id}")
    public Optional<User> getByUserId(@PathVariable Integer id){
        return userService.SearchUser(id);
    }

    //	AGREGAR UN NUEVO USUARIO
  /*  @PostMapping
    public ResponseEntity<User> SaveUser(@RequestBody User entityUser){
        return new ResponseEntity<User>(userService.SaveUser(entityUser),
                HttpStatus.CREATED);
    }*/

    @PostMapping
	public User saveUser(@RequestBody User user) throws ServerException {
		System.out.println(user);
		userService.saveUser(user);
		if (user == null) {
	        throw new ServerException(null);
	    }
		else {
	        return user;
	    }
	}

    //Borrar un usuario
    @DeleteMapping("/{id}")
    public void DeleteUser(@PathVariable int id){
        userService.DeleteUser(id);
    }

    //	ACTUALIZAR UN USUARIO
  /* @PutMapping("/{id}")
    public User UpdateUser(@RequestBody User entityUser,@PathVariable int id){
       return userService.UpdateUser(id,entityUser);
   }*/

   @PutMapping
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}



}
