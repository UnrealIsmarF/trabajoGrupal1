package modelo;

import java.util.ArrayList;


public class EntregaEquipoModel {
   public ArrayList<EntregaEquipoModel> DatosPersona   = new ArrayList<EntregaEquipoModel>();
   
   public void IngresoPersona(String Apellidos, String Nombre, String Telefono){
       
        EntregaEquipoModel NuevaEntrega = new EntregaEquipoModel();
        this.DatosPersona.add(NuevaEntrega);
            }

            public ArrayList EntregaEquipoModel()
            {
                return EntregaEquipoModel();
            }
}
