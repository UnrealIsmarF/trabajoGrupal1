
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.registroReparacionModel;
import vista.frmEnviarReparacion;
import vista.frmVistaPrincipal;


public class controlerRegistroReparacion implements ActionListener {
    
    frmVistaPrincipal VistaPrincipal;
    frmEnviarReparacion VistaReparacion;
    registroReparacionModel VistaReparacionModel;
    public DefaultTableModel TablaRegistroReparacion = new DefaultTableModel();

    public controlerRegistroReparacion(frmVistaPrincipal VistaPrincipal, frmEnviarReparacion VistaReparacion, registroReparacionModel VistaReparacionModel) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaReparacion = VistaReparacion;
        this.VistaReparacionModel = VistaReparacionModel;
        
        this.TablaRegistroReparacion.addColumn("CODIGO EQUIPO");
        this.TablaRegistroReparacion.addColumn("DESCRIPCION REPARACION");
        this.TablaRegistroReparacion.addColumn("TECNICO ASIGNADO");
        this.TablaRegistroReparacion.addColumn("FECHA DE INGRESO");
        
        this.VistaReparacion.jtRegistroRep.setModel(TablaRegistroReparacion);
        
        this.VistaPrincipal.btnEnviarReparacion.addActionListener(this);
        
        this.VistaPrincipal.setExtendedState(frmVistaPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==this.VistaPrincipal.btnEnviarReparacion)
        {
            this.VistaReparacion.btnRegistrarReparacion.addActionListener(this);
            
            this.VistaReparacion.setLocationRelativeTo(null);
            this.VistaReparacion.setVisible(true);
        }
        
        if(e.getSource()==this.VistaReparacion.btnRegistrarReparacion)
        {
            this.VistaReparacionModel.RegistroReparacion(this.VistaReparacion.txtCodigoEquipo.getText(), 
                    this.VistaReparacion.txtDescripcionRep.getText(), this.VistaReparacion.txtTecnico.getText(),
                    this.VistaReparacion.txtFechaIngreso.getText());
        }  
        
        this.TablaRegistroReparacion.addRow(new Object[]{this.VistaReparacionModel.ListaRegistroReparacion.get(0).getCodigo(),
        this.VistaReparacionModel.ListaRegistroReparacion.get(0).getDescripcion(), this.VistaReparacionModel.ListaRegistroReparacion.get(0).getTecnico(),
        this.VistaReparacionModel.ListaRegistroReparacion.get(0).getFecha()});
    }
       
    
}
