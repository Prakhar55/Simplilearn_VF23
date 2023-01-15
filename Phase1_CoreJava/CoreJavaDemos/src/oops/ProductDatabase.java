package prodmngtsys.Database;

import prodmngtsys.entity.Product;

public class ProductDatabase {

	private Product products[];
	int count =0;
	
	public ProductDatabase (int noofproducts)
	{
		products = new Product[noofproducts];
	}
	
	public void insertProduct(Product product)
	{
			products[count++] = product;
	}
	
	public void updateProduct(Product product,int index)
	{
		products[index]=product;
	}
	
	public void deleteProduct(int index)
	{
				products[index]=null;
	}
	public Product[] getAllProducts()
	{
		return products;
	}
	public Product getProductByID(int index)
	{
		return products[index];
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}
	
	
}
