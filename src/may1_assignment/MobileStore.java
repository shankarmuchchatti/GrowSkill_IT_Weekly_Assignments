package may1_assignment;

import java.util.ArrayList;
import java.util.Collections;

class Mobile implements Comparable<Mobile> {
	String brand;
	String model;
	int price;

	Mobile(String brand, String model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	@Override
	public int compareTo(Mobile mb) {

		return mb.price - this.price;
	}

	public int getPrice() {

		return this.price;
	}

	public String getBrand() {

		return this.brand;
	}

	public String getModel() {

		return this.model;
	}

	public void setPrice(int price) {
		this.price = price;

	}
}

public class MobileStore {

	public static void main(String[] args) {
		ArrayList<Mobile> mobiles = new ArrayList<Mobile>();

		Mobile mb1 = new Mobile("Samsung", "S23", 70000);
		Mobile mb2 = new Mobile("Apple", "iPhone15", 80000);
		Mobile mb3 = new Mobile("OnePlus", "12", 60000);
		Mobile mb4 = new Mobile("Vivo", "V30", 35000);
		Mobile mb5 = new Mobile("Realme", "GT", 30000);
		mobiles.add(mb1);
		mobiles.add(mb2);
		mobiles.add(mb3);
		mobiles.add(mb4);
		mobiles.add(mb5);
		System.out.println("Original Mobiles : ");
		for (Mobile mb : mobiles) {
			System.out.println(
					"Mobile Brand: " + mb.brand + ", Mobile Model: " + mb.model + ", Mobile Price: " + mb.price);
		}

		Collections.sort(mobiles);
		System.out.println("After Sorting Descending :");
		for (Mobile mb : mobiles) {
			System.out.println(
					"Mobile Brand: " + mb.brand + ", Mobile Model: " + mb.model + ", Mobile Price: " + mb.price);
		}

		int maxPrice = 0;
		for (Mobile mb : mobiles) {
			if (mb.getPrice() > maxPrice) {
				maxPrice = mb.getPrice();
			}
		}
		int finalMaxPrice = maxPrice;
		mobiles.removeIf(mobile -> mobile.getPrice() == finalMaxPrice);

		System.out.println("After Removing Most Expensive Mobile :");
		for (Mobile mb : mobiles) {
			System.out.println(
					"Mobile Brand: " + mb.brand + ", Mobile Model: " + mb.model + ", Mobile Price: " + mb.price);
		}

		String searchBrand = "Samsung";
		for (Mobile mb : mobiles) {
			if (mb.getBrand().equals(searchBrand)) {
				System.out.println("Brand Found : " + mb.getBrand());
			}
		}

		String searchModel = "GT";
		for (Mobile mb : mobiles) {
			if (mb.getModel() == searchModel) {
				mb.setPrice(90000);
			}
		}

		Collections.sort(mobiles);

		System.out.println("After Price Update : ");
		for (Mobile mb : mobiles) {
			System.out.println(
					"Mobile Brand: " + mb.brand + ", Mobile Model: " + mb.model + ", Mobile Price: " + mb.price);
		}

	}

}
