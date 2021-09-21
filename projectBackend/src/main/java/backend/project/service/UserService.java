package backend.project.service;

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

    public List<User> listUser(){
        return (List<User>) userRepository.findAll();
    }

    public Optional<User>getByUserId(Integer userid){
        return userRepository.findById(userid);
    }


    public List<User> userCreation(){
        return (List<User>) userRepository.findAll();
    }

    public Optional<User>userUpdate(Integer userid){
        return userRepository.findById(userid);
    }

}
