package entities;

public class Product2 {
	// private é o encapsulamento dos objetos | não é possivel acessar diretamento o objeto | deve ser declarado o set e get para isso
	private String name;
	private double price;
	private int quantity;
	// Por convesão o construtor vem depois dos atributos
	// sobrecarga com construtor padrão
	public Product2() {
	}
	public Product2 (String name, double price, int quantity) {
		// this faz referencia aos atributos
		// atribuição de name, price e quantity faz referencia aos paramentos do construtor
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	// sobrecarga com construtor com dois argumentos
	public Product2(String name, double price) {
		this.name = name;
		this.price = price;
		}
	
	// Por convesão a declaração de getters e setters vem depois dos construtores
	public String getName() {
		return name;
	}	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
		+ ", $ "
		+ String.format("%.2f", price)
		+ ", "
		+ quantity
		+ " units, Total: $ "
		+ String.format("%.2f", totalValueInStock());
		}
}
