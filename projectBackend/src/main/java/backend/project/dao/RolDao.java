package backend.project.dao;

import backend.project.model.Rol;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RolDao {
    public void createRol(Rol rol);

}
