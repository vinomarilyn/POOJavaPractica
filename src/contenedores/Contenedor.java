package contenedores;

public abstract class Contenedor {
    private double posicionX;
    private double posicionY;
    private int capacidad;
    private int cantidadDeResiduos;


    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


    public int getCantidadDeResiduos() {
        return cantidadDeResiduos;
    }

    public void setCantidadDeResiduos(int cantidadDeResiduos) {
        this.cantidadDeResiduos = cantidadDeResiduos;
    }
    public boolean isFull(){
        return cantidadDeResiduos == capacidad;
    }
    public void empty(){
        cantidadDeResiduos=0;
    }

}
