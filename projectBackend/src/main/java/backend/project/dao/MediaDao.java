package backend.project.dao;

import backend.project.model.Media;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MediaDao {
    public void insertImage(Media media);
    public List<Media>getMediaList(Integer projectsId);
}
