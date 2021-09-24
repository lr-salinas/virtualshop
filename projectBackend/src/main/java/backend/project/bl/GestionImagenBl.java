package backend.project.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import backend.project.dao.ImagenDao;
import backend.project.model.imagenDto;

import java.sql.SQLException;
import java.util.List;

@Service
public class GestionImagenBl {
    @Autowired
    ImagenDao imagenDao;


    public int upload(MultipartFile file, imagenDto im){
        return imagenDao.upload(file,im);
    }




}
