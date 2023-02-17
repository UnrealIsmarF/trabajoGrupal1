package modelo;

import java.util.ArrayList;


public class ingresoPropietariosModel {

public ArrayList<IngresoPropietarios> ListaIngresoPropietarios = new ArrayList<IngresoPropietarios>();
    
public void IngresoPropietarios(String Apellidos, String Nombre, String Telefono)
            {
                IngresoPropietarios NuevoPropietario = new IngresoPropietarios(Apellidos,
                        Nombre, Telefono);
                 this.ListaIngresoPropietarios.add(NuevoPropietario);
            }

            public ArrayList ListarIngresoPropietario()
            {
                return ListaIngresoPropietarios;
            }
}
