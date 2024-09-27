package backend.project.service;

import backend.project.entity.Media;
import backend.project.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MediaService {
    @Autowired
    private MediaRepository mediaRepository;

    /*public List<Media> getListMedia(){
        return (List<Media>) mediaRepository.findAll();
    }

    public Optional<Media> getById(Integer id){
        return mediaRepository.findById(id);
    }*/


}
