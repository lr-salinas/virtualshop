package backend.project.service;

import backend.project.entity.Producto;
import backend.project.entity.User;
import backend.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> ListUser(){
        return (List<User>) userRepository.findAll();
    }

    public Optional<User> SearchUser(int id){
        return userRepository.findById(id);
    }

  /*  public User SaveUser(User user){
        return userRepository.save(user);
    }*/

    public void DeleteUser(int id){
        userRepository.deleteById(id);
    }

   /* public User UpdateUser(int id, User userUpdate) {
        User userReturn = new User();
        Optional<User> u = userRepository.findById(id);

        if(u.isPresent()){
            userReturn = u.get();
            userReturn = userUpdate;
            userRepository.save(userReturn);
        }
        return userReturn;
    }*/

    public void saveUser(User user){
        userRepository.save(user);
    }

    public void updateUser(User user){
        userRepository.save(user);
    }

  /*  public User login(User user){
        User user1 = new User();
        user1.setUsername(user.getUsername());
        user1.setPassword(user.getPassword());
        User user2= new User();
        if (userRepository.findPersonByNP(user1)!=null){
            return userRepository.findPersonByNP(user1);
        }else{
            return user2;
        }
    }

*/
}
