package Animal;

public class Animal {
	public static void main(String[] args) {
		
	}
}

abstract class Mammal extends Animal {
	public abstract String bark();
	public abstract String getFood();
}


abstract class Reptile extends Animal {
	public abstract String getFood();
}

final class Cat extends Mammal {
	private String name;
	private float weight;
	private String nameSlave;
	
	Cat(String name, float weight){
		setName(name);
		setWeight(weight);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public String getFood() {
		System.out.println("Fish");
		return "Fish";
	}
	
	public String bark() {
		System.out.println("Meow");
		return "Meow";
	}
	
	public String getNameSlave() {
		return nameSlave;
	}
	
	public void setNameSlave(String nameSlave) {
		this.nameSlave = nameSlave;
	}
}

final class Dog extends Mammal {
	private String name;
	private float weight;
	private String nameMaster;
	

	Dog(String name, float weight){
		setName(name);
		setWeight(weight);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public String getFood() {
		System.out.println("Apple");
		return "Apple";
	}
	
	public String bark() {
		System.out.println("Bowbow");
		return "Bowbow";
	}
	
	public String getNameMaster() {
		return nameMaster;
	}
	
	public void setNameMaster(String nameMaster) {
		this.nameMaster = nameMaster;
	}
}

final class Crocodile extends Reptile {
	private String name;
	private float weight;
	
	Crocodile(String name, float weight){
		setName(name);
		setWeight(weight);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public String getFood() {
		System.out.println("Meat");
		return "Meat";
	}
}
