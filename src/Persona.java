public abstract class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido){
        this.apellido=apellido;
        this.nombre=nombre;

    }
    public  boolean login(){
        return true;
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

    public abstract boolean login(String pin);
}
