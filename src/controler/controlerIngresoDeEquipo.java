
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.IngresoDeEquipoModel;
import vista.frmIngresoEquipo;
import vista.frmVistaPrincipal;

public class controlerIngresoDeEquipo implements ActionListener{
    
    frmVistaPrincipal VistaPrincipal;
    frmIngresoEquipo VistaIngresoEquipo;
    IngresoDeEquipoModel VistaIngresoEquipoModel;
    public DefaultTableModel TablaIngresoEquipo = new DefaultTableModel();

    public controlerIngresoDeEquipo(frmVistaPrincipal VistaPrincipal, 
            frmIngresoEquipo VistaIngresoEquipo, IngresoDeEquipoModel VistaIngresoEquipoModel) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaIngresoEquipo = VistaIngresoEquipo;
        this.VistaIngresoEquipoModel = VistaIngresoEquipoModel;
        
        this.TablaIngresoEquipo.addColumn("MARCA");
        this.TablaIngresoEquipo.addColumn("MODELO");
        this.TablaIngresoEquipo.addColumn("TIPO");
        this.TablaIngresoEquipo.addColumn("PROBLEMA");
        
        this.VistaIngresoEquipo.jtIngresoEquipo.setModel(TablaIngresoEquipo);
        
        this.VistaPrincipal.btnEnviarReparacion.addActionListener(this);
        
        this.VistaPrincipal.setExtendedState(frmVistaPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==this.VistaPrincipal.btnEnviarReparacion)
        {
            this.VistaIngresoEquipo.btnIngresarPC.addActionListener(this);
            
            this.VistaIngresoEquipo.setLocationRelativeTo(null);
            this.VistaIngresoEquipo.setVisible(true);
        }
        
        if(e.getSource()==this.VistaIngresoEquipo.btnIngresarPC)
        {
            this.VistaIngresoEquipoModel.RegistroReparacion(this.VistaIngresoEquipo.txtMarca.getText(), 
                    this.VistaIngresoEquipo.txtModelo.getText(), this.VistaIngresoEquipo.txtTipoComputadora.getText(),
                    this.VistaIngresoEquipo.txtProblemaPresenta.getText());
        }  
        
        this.TablaIngresoEquipo.addRow(new Object[]{this.VistaIngresoEquipoModel.ListaIngresoDeEquipo.get(0).getMarca(),
        this.VistaIngresoEquipoModel.ListaIngresoDeEquipo.get(0).getModelo(), this.VistaIngresoEquipoModel.ListaIngresoDeEquipo.get(0).getTipo(),
        this.VistaIngresoEquipoModel.ListaIngresoDeEquipo.get(0).getProblema()});
    }
    
}
