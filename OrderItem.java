package DemoOOPS;

public class OrderItem {
	private String ItemName;
	private int Price;
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public OrderItem(String itemName, int price) {
		super();
		ItemName = itemName;
		Price = price;
	}
	@Override
	public String toString() {
		return "OrderItem [ItemName=" + ItemName + ", Price=" + Price + "]";
	}
	
}
