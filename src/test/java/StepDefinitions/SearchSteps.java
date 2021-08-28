package StepDefinitions;

import Product.Product;
import Product.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	Product product;
	Search search;

	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {

		System.out.println("search page");

	}

	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
		System.out.println("product with name: " + productName + "price: " + price);

		product = new Product(productName, price);

	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {

		System.out.println("product dispalyed: " + productName + "is Displayed");

		search = new Search();
		
		String name= search.DisplayProduct(product);
		System.out.println(name);

	}

}
