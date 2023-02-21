
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.ingresoPropietariosModel;
import vista.EntregadeEquipo;
import vista.frmIngresoEquipo;
import vista.frmVistaPrincipal;

public class controleEntregaEquipo implements ActionListener{
    frmVistaPrincipal VistaPrincipal;
    EntregadeEquipo VistaEntregaEquipo;
    frmIngresoEquipo VistaEntregadeEquipo;
    public DefaultTableModel TablaEntregaEquipo = new DefaultTableModel();
    
    public controleEntregaEquipo(frmVistaPrincipal VistaPrincipal, EntregadeEquipo VistaEntregadeEquipo, EntregadeEquipo VistaEntregadeEquipoModel){
        this.VistaPrincipal = VistaPrincipal;
        this.VistaEntregaEquipo = VistaEntregaEquipo;
        this.VistaEntregaEquipo = VistaEntregadeEquipo;
        
        this.TablaEntregaEquipo.addColumn("CODIGO");
        this.TablaEntregaEquipo.addColumn("NOMBRE");
        this.TablaEntregaEquipo.addColumn("FECHA");
        this.TablaEntregaEquipo.addColumn("DESCRIPCION");
        
        this.VistaEntregaEquipo.tbltabla.setModel(TablaEntregaEquipo);
        
        this.VistaEntregaEquipo.btnentregar.addActionListener(this);
        
        this.VistaEntregaEquipo.setExtendedState(frmVistaPrincipal.MAXIMIZED_BOTH);
        this.VistaEntregaEquipo.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.VistaEntregaEquipo.btnentregar){
            this.VistaEntregaEquipo.btnentregar.addActionListener(this);
            
            this.VistaEntregaEquipo.setLocationRelativeTo(null);
            this.VistaEntregaEquipo.setVisible(true);
        }
        
        if(e.getSource()== this.VistaEntregaEquipo.btnentregar){
           this.VistaEntregaEquipo.EntregadeEquipo(this.VistaEntregaEquipo.txtcod.getText(),
            this.VistaEntregaEquipo.txtnom.getText(), this.VistaEntregaEquipo.txtdescrip.getText(), this.VistaEntregaEquipo.txtfecha.getText());
        }
        
    }
    
}
