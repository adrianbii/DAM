package t9_objetos;

import java.util.Scanner;

public class Usuario {

	private String email;
	private String pass;

	Scanner in = new Scanner(System.in);

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public Usuario(String email, String pass) {
		this.email=email;
		this.pass=pass;	
		}
	public Usuario() {}

	public Usuario(Usuario usuario) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Usuario [email=" + email + ", pass=" + pass + ", in=" + in + "]";
	}

	
	
}
