package backend.project.model;

import java.util.Date;

public class MediaModel {

    private int media_id;
    private int product_id;
    private String url;
    private int type;
    private Date creation_date;
    private int status;

    public MediaModel(int media_id, int product_id, String url, int type, Date creation_date, int status) {
        super();
        this.media_id = media_id;
        this.product_id = product_id;
        this.url = url;
        this.type = type;
        this.creation_date = creation_date;
        this.status = status;
    }

    public int getMedia_id() {
        return media_id;
    }

    public void setMedia_id(int media_id) {
        this.media_id = media_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public MediaModel() {
        super();
    }
}
