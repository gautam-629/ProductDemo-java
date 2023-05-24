public class Product {
    private String name;
    private String type;
    private String place;
    private int warranty;
    
    public Product(String name, String type, String place, int warranty) {
        this.name = name;
        this.type = type;
        this.place = place;
        this.warranty = warranty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public String getType() {
        return type;
    }

    public String getPlace() {
        return place;
    }

    public int getWarranty() {
        return warranty;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", type=" + type + ", place=" + place + ", warranty=" + warranty + "]";
    }
}
