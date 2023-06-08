package Plantilla.example.Plantilla;

import java.util.ArrayList;

public class DataHanding {
    public ArrayList<Criptomoneda> AnadirObjeto1(Criptomoneda objeto1, String ruta)
    {
        //En esta funcion se añaden los nuevos elementos enviados desde el front a un ArrayList para posteriormente actualizar la BBDD
        LeerJson reader = new LeerJson();
        ArrayList<Criptomoneda> listaAux = reader.LeerFicheroJson1(ruta);
        objeto1.setId(listaAux.get(listaAux.size() - 1).getId() + 1);
        listaAux.add(objeto1);
        return listaAux;
    }

    public ArrayList<Criptomoneda> EliminarObjeto (int id, String ruta)
    {
        //En esta funcion se añaden los nuevos elementos enviados desde el front a un ArrayList para posteriormente actualizar la BBDD
        LeerJson reader = new LeerJson();
        ArrayList<Criptomoneda> listaAux = reader.LeerFicheroJson1(ruta);
        for (int i = 0; i < listaAux.size() ; i++ )
        {
            if(listaAux.get(i).getId() == id)
            {
                listaAux.remove(i);
            }
        }
        return listaAux;
    }



}
