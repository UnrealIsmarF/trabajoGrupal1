
package modelo;

import java.util.ArrayList;

public class registroReparacionModel {
    
    public ArrayList<RegistroReparacion> ListaRegistroReparacion = new ArrayList<RegistroReparacion>();
    
    public void RegistroReparacion(String Codigo, String Descripcion, String Tecnico, String Fecha)
    {
        RegistroReparacion NuevoRegistroRep = new RegistroReparacion(Codigo, Descripcion, Tecnico, Fecha);
        this.ListaRegistroReparacion.add(NuevoRegistroRep);
    }
    
    public ArrayList ListarUsuarios()
    {
        return ListaRegistroReparacion;
    }   
}
