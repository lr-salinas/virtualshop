package backend.project.dao;

import backend.project.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    public void updateUser(User user);
    public User findByUserId(Integer userId);
    List<User> findByUsername(String username, Integer userId);
}
