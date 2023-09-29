package camiones;
import Estaciones.Estacion;
import contenedores.Contenedor;
import contenedores.ContenedorResiduosHumedos;


public  class CamionRecolector {
    private int capacidad;
    private int cantidadDeResiduos;
    private double posicionX;
    private double posicionY;



    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public int getCapacidadRestante(){
        return capacidad - cantidadDeResiduos;
    }
    public  boolean puedeCargar(Contenedor contenedor){
        if(
                this.esCompatibleCon(contenedor)&& contenedor.isFull()
                && getCapacidadRestante() >= contenedor.getCapacidad() &&
                this.estaEnLaMismaPosicionQue(contenedor)
        )
        {
            return true;

        }else {
            return false;
        }
    }

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
    public boolean esCompatibleCon(Contenedor contenedor){
        return false;
    }
    public boolean estaEnLaMismaPosicionQue(Contenedor contenedor){
        if(
           getPosicionX() == contenedor.getPosicionX() &&
           getPosicionY() == contenedor.getPosicionY()
        ){
            return true;
        }else {
            return false;
        }

    }
    public void vaciarContenedor(Contenedor contenedor){
        if(puedeCargar(contenedor)){
            contenedor.empty();
            cantidadDeResiduos += contenedor.getCapacidad();
        }

    }

    public int getCantidadDeResiduos() {
        return cantidadDeResiduos;
    }

    public void setCantidadDeResiduos(int cantidadDeResiduos) {
        this.cantidadDeResiduos = cantidadDeResiduos;
    }
    public void volcarContenido(Estacion estacion){
        if (estacion.aceptaDescargaDe(this)) {
            estacion.incrementarCantidadDeResiduos(cantidadDeResiduos);
            this.empty();
        }
    }
    public void empty(){
        cantidadDeResiduos=0;
    }

}
