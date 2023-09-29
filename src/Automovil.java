public class Automovil {
    // variables de clase
    private String marca;
    private String modelo;
    private String color;
    private String velocidadMaxima;

    //constructor que inicializa las variables de clase
    public Automovil(){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
    }
    //metodos getter y setter para poder recuperar o recuperar
    // los datos de las variables de clase
    public String getMarca(){
        return marca;

    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getColor(){
        return  color;
    }
    public  void  setColor(String color){
        this.color= color;
    }
    public String getVelocidadMaxima(){
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(String velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }


}
