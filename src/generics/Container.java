package generics;


// How to create a Generic class
public class Container<i1, i2> {
	//i1, i2 are generic and usable for any data type
	i1 item1;
	i2 item2;
	
	public Container(i1 item1, i2 item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	
	
	public i1 getItem1() {
		return item1;
	}



	public void setItem1(i1 item1) {
		this.item1 = item1;
	}



	public i2 getItem2() {
		return item2;
	}



	public void setItem2(i2 item2) {
		this.item2 = item2;
	}



	public void printItems() {
		System.out.println("Priting contents of container: ");
		System.out.println("Item 1: " + item1);
		System.out.println("Item 2: " + item2);
	}
	
	
	
	
	
	
}
