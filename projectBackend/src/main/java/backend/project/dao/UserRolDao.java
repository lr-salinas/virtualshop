package backend.project.dao;

import backend.project.model.UserRol;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRolDao {
    public void createUserRol(UserRol userRol);
}
