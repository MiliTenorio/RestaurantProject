
public class Product {

	int productId;
	String productName;
	
	public Product(int id, String name) {
		this.productId = id;
		this.productName = name;
	}
	
	//Get and Setters
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void showProduct(Product product) {
		System.out.printf("Code: %d | Item: %s \n",product.productId, product.productName);
	}
}