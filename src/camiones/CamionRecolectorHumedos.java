package camiones;

import contenedores.Contenedor;
import contenedores.ContenedorResiduosHumedos;

public class CamionRecolectorHumedos extends CamionRecolector{
    public CamionRecolectorHumedos(){
        setCapacidad(40);
    }
    @Override
    public boolean esCompatibleCon (Contenedor contenedor)
    {
        return contenedor instanceof ContenedorResiduosHumedos;
    }

}
