public class Frase {

    private int id;
    private String frase;
    private String firma;
    private int nlikes=0;
    public int getId() {
        return id;
    }
    public int getNlikes() {
        return nlikes;
    }
    public void setNlikes(int nlikes) {
        this.nlikes = nlikes;
    }
    public String getFirma() {
        return firma;
    }
    public void setFirma(String firma) {
        this.firma = firma;
    }
    public String getFrase() {
        return frase;
    }
    public void setFrase(String frase) {
        this.frase = frase;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Frase (){
        id+=0;
        frase=" Holaaa, ¿Cómo te llamas?";
        firma="By: Adrián";
    }

    public Frase(String frase, String firma){
        
        this.frase=frase;
        this.firma=firma;
    }
    
}
