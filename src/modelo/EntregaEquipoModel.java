package modelo;

import java.util.ArrayList;


public class EntregaEquipoModel {
    
   public ArrayList<entregaEquipo> DatosPersona   = new ArrayList<entregaEquipo>();
   
   public void IngresoPersona(String Codigo, String Nombre, String Fecha , String Descripcion){
       
        entregaEquipo NuevaEntrega = new entregaEquipo(Codigo, Nombre, Fecha, Descripcion);
        this.DatosPersona.add(NuevaEntrega);
    }

    public ArrayList EntregaEquipoModel()
    {
        return EntregaEquipoModel();
    }
}
