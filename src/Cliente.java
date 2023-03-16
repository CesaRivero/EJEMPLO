public class Cliente extends Persona{
    private int saldo;
    private String cuenta;
    private String pin;

   public  Cliente (String nombre,String apellido,int saldo, String cuenta,String pin){
       super(nombre,apellido);
       this.saldo=saldo;
        this.cuenta=cuenta;
        this.pin=pin;

    }
    @Override
    public boolean login(String pin){
       if (this.getPin().equalsIgnoreCase(pin)){
           return true;
       }else{return false;}

    }
    public String cambiarPin(String pinNuevo){
       if (pinNuevo.equalsIgnoreCase(pin)){
           return"El pin ingresado es igual al anterior";
       }else {
           this.setPin(pinNuevo);
           return"Se ha cambiado correctamente su pin:"+this.getPin();}

    }

  public String retirarDinero(Cajero cajero,int monto){
     if (this.getSaldo()>=monto){
         if (cajero.getSaldo()>=monto){
             this.setSaldo(this.getSaldo()-monto);
             cajero.setSaldo(cajero.getSaldo()-monto);
         }else{return "No hay saldo disponible";}
     }else{return "No tienes saldo disponible";}
     return "Operacion exitosa\nSu nuevo saldo es:"+this.getSaldo();
   }


    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
