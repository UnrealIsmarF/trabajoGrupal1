
package modelo;


public class RegistroReparacion {
    
    String Codigo;
    String Descripcion;
    String Tecnico;
    String Fecha;

    public RegistroReparacion(String Codigo, String Descripcion, String Tecnico, String Fecha) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Tecnico = Tecnico;
        this.Fecha = Fecha;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getTecnico() {
        return Tecnico;
    }

    public void setTecnico(String Tecnico) {
        this.Tecnico = Tecnico;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    } 
}
