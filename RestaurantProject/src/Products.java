
public class Products {
	
	int productsQty;
	Product productsProduct;
	
	public Products(int qty, Product product) {
		this.productsQty = qty;
		this.productsProduct = product;
	}
	
	public int getProductsQty() {
		return productsQty;
	}
	public void setProductsQty(int productsQty) {
		this.productsQty = productsQty;
	}
	public Product getProductsProduct() {
		return productsProduct;
	}
	public void setProductsProduct(Product productsProduct) {
		this.productsProduct = productsProduct;
	}

}
