
import controler.controlerRegistroReparacion;
import modelo.registroReparacionModel;
import vista.frmEnviarReparacion;
import vista.frmVistaPrincipal;


public class main {

    
    public static void main(String[] args) {
        
        frmVistaPrincipal VistaPrincipal = new frmVistaPrincipal();
        frmEnviarReparacion VistaReparacion = new frmEnviarReparacion(VistaPrincipal, true);
        registroReparacionModel VistaReparacionModel = new registroReparacionModel();
        
        controlerRegistroReparacion ControladorRegistroRep = new controlerRegistroReparacion(VistaPrincipal, VistaReparacion,
        VistaReparacionModel);      
    }  
}
