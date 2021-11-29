package backend.project.repository;

import backend.project.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Integer> {

   // public User findPersonByNP(User user);

  /*  @Query("select user_id as user_id," +
            "      name as name" +
            "      lastname as lastname" +
            "      email as email" +
            "      username as username" +
            "from user " +
            "where username =#{username} and password=#{password} ")
*/
}

