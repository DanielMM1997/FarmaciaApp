package gui;
public class CuentasApp{

    private String[] cuentas;
    private int ulti = 4;
    private String nombre;
    private String apellidos;
    private String nombreU;
    private String correo;
    private String contra;
    
    public CuentasApp(){
        cuentas = new String[100];
        cuentas[0] = "Cire";
        cuentas[1] = "1234";
        cuentas[2] = "Dani";
        cuentas[3] = "4321";
    }
    
    public void añadirCuenta(String usu, String contra){
        cuentas[ulti] = usu;
        cuentas[ulti+1] = contra;
        ulti += 2;
    }
    
    public boolean verificarCuenta(String usu, String contra){
        for (int i = 0; i < cuentas.length; i+=2){
            try {
                if (cuentas[i].equals(usu) && cuentas[i+1].equals(contra)){
                    return true;
                }
            } catch (Exception ex){}
        }
        return false;
    }
    
    public void ponerDatos(String nombre, String apellidos, String nombreU, String correo, String contra){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.nombreU = nombreU;
    }
    
    public String getName(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellidos;
    }
}