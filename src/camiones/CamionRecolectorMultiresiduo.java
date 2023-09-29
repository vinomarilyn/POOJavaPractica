package camiones;

import contenedores.Contenedor;
import contenedores.ContenedorResiduosHumedos;

public class CamionRecolectorMultiresiduo extends CamionRecolector{
    public CamionRecolectorMultiresiduo(){
        setCapacidad(50);
    }
    @Override
    public boolean esCompatibleCon (Contenedor contenedor)
    {
        return true;
    }

}
