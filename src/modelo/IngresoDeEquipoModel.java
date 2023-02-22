
package modelo;

import java.util.ArrayList;

public class IngresoDeEquipoModel {
    
    public ArrayList<IngresoEquipo> ListaIngresoDeEquipo = new ArrayList<IngresoEquipo>();
    
    public void RegistroEquipos(String Marca, String Modelo, String Tipo, String Problema)
    {
        IngresoEquipo NuevoIngresoEquipo = new IngresoEquipo(Marca, Modelo, Tipo, Problema);
        this.ListaIngresoDeEquipo.add(NuevoIngresoEquipo);
    }
    
    public ArrayList ListarIngresoEquipos()
    {
        return ListaIngresoDeEquipo;
    }
    
}
