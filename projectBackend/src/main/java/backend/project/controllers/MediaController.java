package backend.project.controllers;

import backend.project.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/producto")

public class MediaController {
    @Autowired
    private MediaService mediaService;

   /* @GetMapping
    public List<Media> getMediaList(){
        return mediaService.getListMedia();
    }

    @GetMapping("/{id}")
    public Optional<Media> getById(@PathVariable Integer id){
        return (Optional<Media>)mediaService.getById(id);
    }

*/
}
