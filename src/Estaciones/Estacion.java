package Estaciones;

import camiones.CamionRecolector;

public class Estacion {
    public int capacidad;
    public int cantidadDeResiduos;


    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCantidadDeResiduos() {
        return cantidadDeResiduos;
    }
    public void incrementarCantidadDeResiduos(int cantidadDeResiduos){
        this.cantidadDeResiduos += cantidadDeResiduos;
    }

    public void setCantidadDeResiduos(int cantidadDeResiduos) {
        this.cantidadDeResiduos = cantidadDeResiduos;
    }
    public int getCapacidadRestante(){
        return capacidad - cantidadDeResiduos;
    }

    public boolean aceptaDescargaDe(CamionRecolector camionRecolector){
        if(getCapacidadRestante() >= camionRecolector.getCantidadDeResiduos()){
            return true;
        }else {
            return false;
        }

    }

}
