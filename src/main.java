
import controler.controleEntregaEquipo;
import controler.controlerIngresoPropietarios;
import controler.controlerRegistroReparacion;
import modelo.EntregaEquipoModel;
import modelo.ingresoPropietariosModel;
import modelo.registroReparacionModel;
import vista.frmEnviarReparacion;
import vista.frmIngresoPropietarios;
import vista.frmVistaPrincipal;
import vista.frmEntregadeEquipo;
import modelo.entregaEquipo;
import vista.frmIngresoEquipo;


public class main {

    
    public static void main(String[] args) {
        
        frmVistaPrincipal VistaPrincipal = new frmVistaPrincipal();
        frmEnviarReparacion VistaReparacion = new frmEnviarReparacion(VistaPrincipal, true);
        registroReparacionModel VistaReparacionModel = new registroReparacionModel();

              
        controlerRegistroReparacion ControladorRegistroRep = new controlerRegistroReparacion(VistaPrincipal, VistaReparacion,
        VistaReparacionModel);  
       
        
       frmIngresoPropietarios VistaIngresoPropietarios = new frmIngresoPropietarios(VistaPrincipal, true);
       ingresoPropietariosModel VistaIngresoPropietariosModel = new ingresoPropietariosModel();
       controlerIngresoPropietarios ControladorIngresoPropietarios = new controlerIngresoPropietarios(VistaPrincipal, VistaIngresoPropietarios,
       VistaIngresoPropietariosModel);
       
       frmEntregadeEquipo VistaEquipo = new frmEntregadeEquipo (VistaPrincipal, true);
       EntregaEquipoModel VistaEquipoModel = new EntregaEquipoModel ();
       
       controleEntregaEquipo ControladorEquipoEntrega = new controleEntregaEquipo (VistaPrincipal, VistaEquipo, VistaEquipoModel);
    }     
}
