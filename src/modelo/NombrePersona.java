package modelo;

public class NombrePersona{
        String nombre;
        String apellido;
        String telefono;
        
        public NombrePersona(String nombre, String apellido, String telefono){
            this.apellido = apellido;
            this.nombre = nombre;
            this.telefono = telefono;
            
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
