
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.EntregaEquipoModel;
import vista.frmEntregadeEquipo;
import vista.frmVistaPrincipal;

public class controleEntregaEquipo implements ActionListener{
    frmVistaPrincipal VistaPrincipal;
    frmEntregadeEquipo VistaEntregaEquipo;
    EntregaEquipoModel VistaEntragaEquiposModel;
    public DefaultTableModel TablaEntregaEquipo = new DefaultTableModel();
    
    public controleEntregaEquipo(frmVistaPrincipal VistaPrincipal, frmEntregadeEquipo VistaEntregaEquipo, EntregaEquipoModel VistaEntragaEquiposModel) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaEntregaEquipo = VistaEntregaEquipo;
        this.VistaEntragaEquiposModel = VistaEntragaEquiposModel;
        
        this.TablaEntregaEquipo.addColumn("CODIGO");
        this.TablaEntregaEquipo.addColumn("NOMBRE");
        this.TablaEntregaEquipo.addColumn("FECHA");
        this.TablaEntregaEquipo.addColumn("DESCRIPCION");
        
        this.VistaEntregaEquipo.tbltabla.setModel(TablaEntregaEquipo);
        
        this.VistaPrincipal.btnEntregadeEquipo.addActionListener(this);
        
        this.VistaPrincipal.setExtendedState(frmVistaPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
    }

        
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.VistaPrincipal.btnEntregadeEquipo){
            this.VistaEntregaEquipo.btnentregar.addActionListener(this);
            
            this.VistaEntregaEquipo.setLocationRelativeTo(null);
            this.VistaEntregaEquipo.setVisible(true);
        }
        
        if(e.getSource()== this.VistaEntregaEquipo.btnentregar){
           this.VistaEntragaEquiposModel.IngresoPersona(this.VistaEntregaEquipo.txtcod.getText(),
            this.VistaEntregaEquipo.txtnom.getText(), this.VistaEntregaEquipo.txtdescrip.getText(), this.VistaEntregaEquipo.txtfecha.getText());
        }
        
        this.TablaEntregaEquipo.addRow(new Object[]{this.VistaEntragaEquiposModel.DatosPersona.get(0).getCodigo(),
        this.VistaEntragaEquiposModel.DatosPersona.get(0).getNombre(), this.VistaEntragaEquiposModel.DatosPersona.get(0).getFecha(),
        this.VistaEntragaEquiposModel.DatosPersona.get(0).getDescripcion()});
    }
    
}
