package classesWithAttributes_2;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");
		//Product product = new Product();
		/*
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		product.setRenk("siyah");
		*/
		//System.out.println(product.name);
		
		ProductManager productmanager = new ProductManager();
		productmanager.Add(product);
		
		
		/*
		productmanager.Add2(1, "", "", 2, 200);
		productmanager.Add2(1, "", "", 2, 200);
		productmanager.Add2(1, "", "", 2, 200);
		productmanager.Add2(1, "", "", 2, 200);
		productmanager.Add2(1, "", "", 2, 200);
		productmanager.Add2(1, "", "", 2, 200);
		*/
		
		System.out.println(product.getKod());
	}

}
