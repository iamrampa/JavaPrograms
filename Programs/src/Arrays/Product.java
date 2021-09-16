package Arrays;

public class Product {
	
    private int prodid;
    private String prodName;
    private int price;
    
    public Product(int prodid, String prodName, int price) {
        this.prodid = prodid;
        this.prodName = prodName;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Product [prodid=" + prodid + ", prodName=" + prodName + ", price=" + price + "]";
    }

 

    public Product() {
    
    }
    
    
    
}





