package modelo;

public class NombrePersona{
        String nombre;
        String codigo;
        String descripcion;
        String fecha;
        
        public NombrePersona(String nombre, String codigo, String descripcion, String fecha){
            this.codigo = codigo;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.fecha = fecha;
            
            
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    
}
