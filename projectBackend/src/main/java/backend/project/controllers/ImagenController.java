package backend.project.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import backend.project.bl.GestionImagenBl;
import backend.project.service.CloudinaryService;
import backend.project.model.imagenDto;

import javax.annotation.security.RolesAllowed;
import java.sql.SQLException;
import java.util.Map;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/producto")
public class ImagenController {

    @Autowired
    CloudinaryService cloudinaryService;

    @Autowired
    private GestionImagenBl gestionImagenBl;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/upload")
    public ResponseEntity<Integer> uploadFiles(@RequestParam("files")MultipartFile files) {
        System.out.println("ESTOY AQUI");
        int x=0;
        if(files==null){
            return new ResponseEntity(x, HttpStatus.BAD_REQUEST);
        }
        try {
            Map result = cloudinaryService.upload(files);
            imagenDto imagen = new imagenDto((String) result.get("original_filename"),
                    (String) result.get("url"),
                    (String) result.get("public_id"));
            x = gestionImagenBl.upload(files, imagen);
        }catch(Exception ex ){
            x=0;
        }

        return new ResponseEntity(x, HttpStatus.OK);
    }


}
