public class Usuario {
    private int id;
    private String user;
    private String pass;
    private String nombre;
    private String descripcion;

    private int age;

public Usuario (){
    logger.log("Nuevo usuario");
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getDescripcion() {
    return descripcion;
}

public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getPass() {
    return pass;
}

/*validamos que la contraseña sea mayor de 8 caracteres*/
public void setPass(String pass) {
    if (!(validar(pass))){
    System.out.println("Password insegura"); }
    this.pass=pass;

    
}

public String getUsuario() {
    return user;
}

public void setUsuario(String usuario) {
    this.user = usuario;
}

public Usuario(String user, String pass){
    this.setUsuario(user);
    this.setPass(pass);
}

private boolean validar(String pass){
    if (pass.length()<8) return false;
    else  return true;
}


}