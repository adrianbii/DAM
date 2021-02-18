package t9_objetos;

public class IMC {

	private String name;
	private int age;
	private double weight;
	private double height;

	public IMC(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public IMC(String name, double weight, double height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String toString() {
		return name + " " + height + " " + weight;

	}

	

	public void Status(double weight, double height) {
		
		if (weight/height < 18.5) {
			System.out.println("Bajo peso = menos de 18.5");
		} else if (weight/height < 25) {
			System.out.println("Peso normal = 18.5–24.9");
		} else if (weight/height > 25 && weight/height < 30) {
			System.out.println("Sobrepeso = 25–29.9");
		} else {
			System.out.println("Obesidad = IMC de 30 ó mayor");
		}
		
	}
	
	public static void getIMC( double weight, double height) {
System.out.println(" mostrar "+(weight/height));
		
	}
	

}
