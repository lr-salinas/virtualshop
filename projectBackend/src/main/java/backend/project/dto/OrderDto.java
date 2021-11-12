package backend.project.dto;

public class OrderDto {
    private String product_name;
    private String details;
    private String size;
    private Integer cantidad;

    public OrderDto(String product_name, String details, String size, Integer cantidad) {
        this.product_name = product_name;
        this.details = details;
        this.size = size;
        this.cantidad = cantidad;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "product_name='" + product_name + '\'' +
                ", details='" + details + '\'' +
                ", size='" + size + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
