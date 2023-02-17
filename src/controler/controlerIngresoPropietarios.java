
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.ingresoPropietariosModel;
import vista.frmIngresoPropietarios;
import vista.frmVistaPrincipal;

public class controlerIngresoPropietarios implements ActionListener {
    
    frmVistaPrincipal VistaPrincipal;
    frmIngresoPropietarios VistaIngresoPropietarios;
    ingresoPropietariosModel VistaIngresoPropietariosModel;
    public DefaultTableModel TablaIngresoPropietarios = new DefaultTableModel();
    
    public controlerIngresoPropietarios(frmVistaPrincipal VistaPrincipal,
            frmIngresoPropietarios VistaIngresoPropietarios, ingresoPropietariosModel VistaIngresoPropietariosModel)
    {
            this.VistaPrincipal = VistaPrincipal;
            this.VistaIngresoPropietarios = VistaIngresoPropietarios;
            this.VistaIngresoPropietariosModel = VistaIngresoPropietariosModel;
            
            this.TablaIngresoPropietarios.addColumn("Apellidos");
            this.TablaIngresoPropietarios.addColumn("Nombre");
            this.TablaIngresoPropietarios.addColumn("Telefono");
            
            this.VistaIngresoPropietarios.jtPropietarios.setModel(TablaIngresoPropietarios);
            
            this.VistaPrincipal.btnIngresoPropietarios.addActionListener(this);
            
            this.VistaPrincipal.setExtendedState(frmVistaPrincipal.MAXIMIZED_BOTH);
            this.VistaPrincipal.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.VistaPrincipal.btnIngresoPropietarios)
        {
            this.VistaPrincipal.btnIngresoPropietarios.addActionListener(this);
            
            this.VistaIngresoPropietarios.setLocationRelativeTo(null);
            this.VistaIngresoPropietarios.setVisible(true);
        }    
        
        if(e.getSource()==this.VistaIngresoPropietarios.btnIngresarPropietario)
        {
            this.VistaIngresoPropietariosModel.IngresoPropietarios(this.VistaIngresoPropietarios.txtApellidos.getText(),
                    this.VistaIngresoPropietarios.txtNombre.getText(), this.VistaIngresoPropietarios.txtTelefono.getText());
        }
        
        this.TablaIngresoPropietarios.addRow(new Object[]{this.VistaIngresoPropietariosModel.ListaIngresoPropietarios.get(0).getApellidos(),
            this.VistaIngresoPropietariosModel.ListaIngresoPropietarios.get(0).getNombre(),
            this.VistaIngresoPropietariosModel.ListaIngresoPropietarios.get(0).getTelefono()
        });
    }
}
