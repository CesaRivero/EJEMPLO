public class Empleado extends Persona{
    private String pin;

    public Empleado(String nombre, String apellido,String pin) {
        super(nombre, apellido);
        this.pin=pin;
    }
    public String cargarCajero(Cajero cajero,int monto){
        if (cajero.getSaldo()==0){
            cajero.setSaldo(cajero.getSaldo()+monto);
            return"Se ha cargado el cajero\nMonto Cajero:"+cajero.getSaldo();
        }else{
            return"No se puede cargar";
        }


    }

    @Override
    public boolean login(String pin){
        if (this.getPin().equalsIgnoreCase(pin)){
            return true;
        }else{return false;}

    }
    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
