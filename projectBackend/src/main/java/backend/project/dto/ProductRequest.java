package backend.project.dto;

import java.util.Date;

public class ProductRequest {
    private Integer productId;
    private String productName;
    private String details;
    private String size;
    private Integer stock;
    private Integer color;
    private Double costProduct;
    private Integer status;

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

    @Override
    public String toString() {
        return "ProductRequest{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", details='" + details + '\'' +
                ", size='" + size + '\'' +
                ", stock=" + stock +
                ", color=" + color +
                ", costProduct=" + costProduct +
                ", status=" + status +
                '}';
    }
}
