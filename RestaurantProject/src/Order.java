import java.util.ArrayList;

public class Order {
	
	int orderId;
	ArrayList<Products> orderProducts;
	
	public Order(int id) {
		this.orderId = id;
		this.orderProducts = new ArrayList<>();
	}
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public ArrayList<Products> getOrderProducts() {
		return orderProducts;
	}
	public void setOrderProducts(ArrayList<Products> orderProducts) {
		this.orderProducts = orderProducts;
	}

	public void addOrderProduct(int qty, Product product) {
		Products newItem = new Products(qty,product);
		this.orderProducts.add(newItem);
	}
	
	public void showOrder(Client client) {
		System.out.printf("\n------------------------------\nDear %s, \n"
				+ "Your order is: \n"
				+ "Qty | Product \n", client.clientName);
		
		for(Products item : client.clientOrder.orderProducts) {
			System.out.printf(" %d  | %s \n", item.productsQty, item.productsProduct.productName);
		}
	}
}
