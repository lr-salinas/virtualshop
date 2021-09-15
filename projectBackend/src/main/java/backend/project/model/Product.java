package backend.project.model;

import java.util.Date;

public class Product {
    private Integer productId;
    private String productName;
    private String details;
    private String size;
    private Integer stock;
    private Integer color;
    private Double costProduct;
    private Integer status;
    private Date createDate;
    private Transaction transaction;

    public Product(){
        transaction = new Transaction();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public Double getCostProduct() {
        return costProduct;
    }

    public void setCostProduct(Double costProduct) {
        this.costProduct = costProduct;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", details='" + details + '\'' +
                ", size='" + size + '\'' +
                ", stock=" + stock +
                ", color=" + color +
                ", costProduct=" + costProduct +
                ", status=" + status +
                ", createDate=" + createDate +
                ", transaction=" + transaction +
                '}';
    }
}
