package Product;

public class Search {
	
	public String DisplayProduct(Product product) {
		
		
		if(product.getProductList().contains(product.getProductName())) {
			
			return product.getProductName();
		}
		
		return null;
		
	}

}
