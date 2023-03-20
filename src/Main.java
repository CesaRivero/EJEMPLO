import javax.swing.JOptionPane;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cajero cajero = new Cajero(5000);
        Empleado empleado = new Empleado("Carlos", "Perez","1234");
        Cliente cliente = new Cliente("Cesar", "Rivero", 2000, "Corriente", "1234");

        int opcion = 0;
        opcion= Integer.parseInt(JOptionPane.showInputDialog("Elija su perfil\n1-Usuario\n2-Empleado\n0-Salir"));
        switch (opcion){
            case 1://ingreso como cliente
                String pin;
                boolean ingreso;
                do {
                pin=JOptionPane.showInputDialog("Ingrese pin");
                ingreso=cliente.login(pin);
                if (ingreso){
                    JOptionPane.showMessageDialog(null,"Clave correcta");

                    String clave;
                    do {
                        clave = JOptionPane.showInputDialog("1-Retirar dinero\n2-Cambiar pin\n3-Historial de movimientos\n0-Salir");

                        switch (clave) {

                            case "1":
                                int montoRetirar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese monto a retirar"));
                                JOptionPane.showMessageDialog(null, cliente.retirarDinero(cajero, montoRetirar));
                                break;

                            case "2":
                            Boolean verificar;
                            String NuevoPin = JOptionPane.showInputDialog("Ingrese nuevo pin");

                            do {
                                verificar=cliente.cambiarPin(NuevoPin);
                                if(verificar){
                                    JOptionPane.showMessageDialog(null,"Se cambio el pin correctamente");

                                }else{NuevoPin = JOptionPane.showInputDialog("Ingrese otro nuevo pin");}
                                
                            } while (!verificar);
                            break;
                        }

                    } while (!clave.equalsIgnoreCase("0"));

                }else {  JOptionPane.showMessageDialog(null,"Clave incorrecta");
                }

                }while(!ingreso);
                break;
            case 2://empleado

                String pinEmpleado;
                do {
                    pinEmpleado=JOptionPane.showInputDialog("Ingrese pin");

                    if (cliente.login(pinEmpleado)){
                    JOptionPane.showMessageDialog(null,"Pin correcto");

                        int montoAcargar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese monto a cargar"));
                        JOptionPane.showMessageDialog(null, empleado.cargarCajero(cajero, montoAcargar));

                }else {  JOptionPane.showMessageDialog(null,"Pin incorrecta");
                }

                     }while(!cliente.login(pinEmpleado));

                    break;
        }
      


    }
}