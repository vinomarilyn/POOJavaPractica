package camiones;

import contenedores.Contenedor;
import contenedores.ContenedorResiduosReciclables;

public class CamionRecolectorReciclables extends CamionRecolector{
    public CamionRecolectorReciclables(){
        setCapacidad(30);
    }
    @Override
    public boolean esCompatibleCon (Contenedor contenedor)
    {
        return contenedor instanceof ContenedorResiduosReciclables;
    }
}
