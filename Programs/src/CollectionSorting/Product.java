package CollectionSorting;

public class Product //implements Comparable<Product> {
{
	private int prodid;
	private String name;
	private int cost;
	
	
	
	public Product(int prodid, String name, int cost) {
		super();
		this.prodid = prodid;
		this.name = name;
		this.cost = cost;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", name=" + name + ", cost=" + cost + "]";
	}
	/*@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);*/
		
	
	
	

}
