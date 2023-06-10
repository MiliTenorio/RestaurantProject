

public class Main {

	public static void main(String[] args) {

		//Creating the menu
		Product[] menu = {
				new Product(0,"Lasagna"), 
				new Product(1,"Fish and Fries"), 
				new Product(2,"Ice Cream"), 
				new Product(3,"Orange Juice"),
				new Product(4,"Strawberry Juice")
				};
		
		//Menu Apresentation
		System.out.printf("Welcome to our Restaurant! \n \n"
				+ "This is our Menu: \n"
				+ "------------------------------\n");
		
		for(Product item : menu) {
			//System.out.printf("Code: %d - Item: %s \n",item.productId, item.productName);
			item.showProduct(item);
		}
		
		System.out.printf("------------------------------\n");
		System.out.println("When you need to order, just let me know.");
		
		//Creating the Clients
		Client client1 = new Client(0,0,"Daniel");
		Client client2 = new Client(1,1,"Carlos");
		Client client3 = new Client(2,1,"Zila");
		Client client4 = new Client(3,2,"Michel");
		Client client5 = new Client(4,2,"Anna");
		
		//Creating the Orders
		System.out.printf("\n\n------------------------------\n");
		System.out.printf("Receiving the Orders\n");
		System.out.printf("------------------------------\n");
		
		Order actualOrder = new Order(0);
		actualOrder.addOrderProduct(1, menu[1]);
		actualOrder.addOrderProduct(1, menu[3]);
		client1.setClientOrder(actualOrder);
		
		actualOrder.setOrderId(1);
		actualOrder.orderProducts.clear();
		actualOrder.addOrderProduct(1, menu[2]);
		actualOrder.addOrderProduct(2, menu[4]);
		client2.setClientOrder(actualOrder);

		actualOrder.setOrderId(1);
		actualOrder.orderProducts.clear();
		actualOrder.addOrderProduct(1, menu[0]);
		actualOrder.addOrderProduct(1, menu[3]);
		actualOrder.addOrderProduct(2, menu[2]);
		client3.setClientOrder(actualOrder);

		actualOrder.setOrderId(1);
		actualOrder.orderProducts.clear();
		actualOrder.addOrderProduct(1, menu[4]);
		actualOrder.addOrderProduct(2, menu[0]);
		client4.setClientOrder(actualOrder);
		
		actualOrder.setOrderId(1);
		actualOrder.orderProducts.clear();
		actualOrder.addOrderProduct(2, menu[0]);
		actualOrder.addOrderProduct(1, menu[3]);
		client5.setClientOrder(actualOrder);

		//Showing the Orders		
		System.out.printf("\n------------------------------\nAll our Orders: \n");
		client1.clientOrder.showOrder(client1);
		client1.clientOrder.showOrder(client2);
		client1.clientOrder.showOrder(client3);
		client1.clientOrder.showOrder(client4);
		client1.clientOrder.showOrder(client5);
		
		System.out.printf("\n------------------------------\nThanks for comming! \n");
		
	}
}