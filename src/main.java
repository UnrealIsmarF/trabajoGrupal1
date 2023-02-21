
import controler.controlerIngresoPropietarios;
import controler.controlerRegistroReparacion;
import modelo.ingresoPropietariosModel;
import modelo.registroReparacionModel;
import vista.frmEnviarReparacion;
import vista.frmIngresoPropietarios;
import vista.frmVistaPrincipal;
import vista.EntregadeEquipo;
import modelo.NombrePersona;


public class main {

    
    public static void main(String[] args) {
        
        frmVistaPrincipal VistaPrincipal = new frmVistaPrincipal();
        frmEnviarReparacion VistaReparacion = new frmEnviarReparacion(VistaPrincipal, true);
        registroReparacionModel VistaReparacionModel = new registroReparacionModel();
        frmIngresoEquipo VistaEntregadeEquipo = new frmIngresoEquipo(VistaPrincipal, true);
              
        controlerRegistroReparacion ControladorRegistroRep = new controlerRegistroReparacion(VistaPrincipal, VistaReparacion,
        VistaReparacionModel);  
       
        
       frmIngresoPropietarios VistaIngresoPropietarios = new frmIngresoPropietarios(VistaPrincipal, true);
       ingresoPropietariosModel VistaIngresoPropietariosModel = new ingresoPropietariosModel();
       controlerIngresoPropietarios ControladorIngresoPropietarios = new controlerIngresoPropietarios(VistaPrincipal, VistaIngresoPropietarios,
       VistaIngresoPropietariosModel);

    }  
    
}
