package backend.project.dto;
public class MoreDto {

    private String product_name;
    private Double cost_product;
    private String image;


    public MoreDto( String product_name, Double cost_product, String image) {

        this.product_name = product_name;
        this.cost_product = cost_product;
        this.image = image;

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
        return "MoreDto{" +
                ", product_name='" + product_name + '\'' +
                ", cost_product=" + cost_product +
                ", image='" + image + '\'' +
                '}';
    }
}
