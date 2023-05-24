import java.util.*;

public class ProductService {
    
    List<Product> products= new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product> getAllProducts(){
         return products;
    }

    public Product geProduct(String name){
        for(Product p : products){
            if(p.getName().equals(name))
                return p;
        }
        return null;
    }
}
