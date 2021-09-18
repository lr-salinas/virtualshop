package backend.project.bl;

import backend.project.dao.MediaDao;
import backend.project.dao.TransactionDao;
import backend.project.dto.MediaRequest;
import backend.project.model.Media;
import backend.project.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MediaBl {
    private MediaDao mediaDao;
    private TransactionDao transactionDao;

    @Autowired
    public MediaBl(MediaDao mediaDao, TransactionDao transactionDao){
        this.mediaDao = mediaDao;
        this.transactionDao = transactionDao;
    }

    public Media insertmedia(MediaRequest mediaRequest, Integer id, Transaction transaction){
        Media media = new Media();
        media.setProductId(id);
        media.setUrl(mediaRequest.getUrl());
        media.setType(mediaRequest.getType());
        media.setCreationDate(new Date());
        media.setTransaction(transaction);
        mediaDao.insertImage(media);

        return media;
    }

    public List<Media> getListMedia(Integer idproduct){
        return mediaDao.getMediaList(idproduct);
    }
}
