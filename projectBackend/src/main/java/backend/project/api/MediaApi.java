package backend.project.api;

import backend.project.bl.MediaBl;
import backend.project.bl.TransactionBl;
import backend.project.dto.MediaRequest;
import backend.project.model.Media;
import backend.project.model.Transaction;
import backend.project.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/product")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MediaApi {

    private MediaBl mediaBl;
    private TransactionBl transactionBl;

    @Autowired
    public MediaApi(MediaBl mediaBl, TransactionBl transactionBl){
        this.mediaBl = mediaBl;
        this.transactionBl = transactionBl;
    }

    @RequestMapping(value = "/{idproduct}/media", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Media insertMedia(@RequestBody MediaRequest mediaRequest, @PathVariable("idproduct") Integer id, HttpServletRequest request){
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        Media mediaResponse = mediaBl.insertmedia(mediaRequest,id,transaction);
                return mediaResponse;
    }

    @RequestMapping(value = "/{idproduct}/media", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Media> getVerifiedTags(HttpServletRequest request, @PathVariable("idproduct") Integer idproduct){

        return mediaBl.getListMedia(idproduct);
    }
}
