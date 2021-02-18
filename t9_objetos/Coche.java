package t9_objetos;

public class Coche {
	
	private String matricula;
	private String marca;
	private String antiguedad;
	private String modelo;


public Coche (String matricula, String marca, String antiguedad, String modelo) {
	this.antiguedad=antiguedad;
	this.marca=marca;
	this.modelo=modelo;
	this.matricula=matricula;
}

public Coche(String matricula) {
	this.matricula=matricula;
}

public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	//this.matricula = validar(matricula);//crear metodo
	this.matricula=matricula;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getAntiguedad() {
	return antiguedad;
}

public void setAntiguedad(String antiguedad) {
	this.antiguedad = antiguedad;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public String toString() {
	return matricula+" "+marca+" "+antiguedad+" "+modelo;

}
}