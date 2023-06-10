/*
 * Class: Client
 * Atributes:
 * 	- Client ID: unique identification to a 
 *  - Client Table: position information about the Client
 *  - Client Name: simple information about the Client
 *  - Client Order: refers other Class that has specification about the Order of this Client
 */

public class Client {
	
	int clientId;
	int clientTable; 
	String clientName;
	Order clientOrder;

	public Client(int id, int table, String name) {
		// TODO Auto-generated constructor stub
		this.clientId = id;
		this.clientTable = table;
		this.clientName = name;
		Order order = null;
		this.clientOrder = order;
	}

	/*
	 * Get and Setters
	 */
	public int getClientTable() {
		return clientTable;
	}

	public void setClientTable(int clientTable) {
		this.clientTable = clientTable;
	}

	public String getClientName() {
		return clientName;
	}

	public Order getClientOrder() {
		return clientOrder;
	}

	public void setClientOrder(Order clientOrder) {
		this.clientOrder = clientOrder;
	}

	public int getClientId() {
		return clientId;
	}
}
