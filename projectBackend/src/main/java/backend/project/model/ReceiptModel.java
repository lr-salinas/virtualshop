package backend.project.model;

import java.sql.Date;
import java.sql.Timestamp;

public class ReceiptModel {
    private int receipt_id;
    private int product_id;
    private int user_id;
    private int card_id;
    private int address_id;
    private Date date;

    public ReceiptModel(int receipt_id, int product_id, int user_id, int card_id, int address_id, Date date) {
        this.receipt_id = receipt_id;
        this.product_id = product_id;
        this.user_id = user_id;
        this.card_id = card_id;
        this.address_id = address_id;
        this.date = date;
    }

    public int getReceipt_id() {
        return receipt_id;
    }

    public void setReceipt_id(int receipt_id) {
        this.receipt_id = receipt_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getCard_id() {
        return card_id;
    }

    public void setCard_id(int card_id) {
        this.card_id = card_id;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ReceiptModel() {
        super();
        // TODO Auto-generated constructor stub
    }


}

