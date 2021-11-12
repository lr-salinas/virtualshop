package backend.project.dto;

public class CartDto {
    private String name;
    private String Lastname;
    private String product_name;
    private Double cost_product;
    private String image;

    public CartDto(String name, String lastname, String product_name, Double cost_product, String image) {
        this.name = name;
        Lastname = lastname;
        this.product_name = product_name;
        this.cost_product = cost_product;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Double getCost_product() {
        return cost_product;
    }

    public void setCost_product(Double cost_product) {
        this.cost_product = cost_product;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "CartDto{" +
                "name='" + name + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", product_name='" + product_name + '\'' +
                ", cost_product=" + cost_product +
                ", image='" + image + '\'' +
                '}';
    }
}
