public class Zona {

    private String Pais;
    private String Ciudad;
    private int id_pais;

    public Zona(){
        Pais="Ubicacion desconocida";
        Ciudad="Ubicacion desconocida";
        id_pais=0;
    }

    public Zona(){}
    public String getPais() {
        return Pais;
    }
    public void setPais(String pais) {
        this.Pais = pais;
    }
    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String ciudad) {
        this.Ciudad = ciudad;
    }

    public int getId_pais() {
        return id_pais;
    }
    
    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }
    
}
