/**
 * Clase con operaciones básicas de una cuenta bancaria.
 * Permite gestionar el número de cuenta, el salda, el nombre y el tipo de interés.
 * 
 * @author Marc Romero Cortes
 */
public class CCuenta {

    /** Nombre de la cuenta */
    private String nombre;
    /** Número de cuenta */
    private String cuenta;
    /** Saldo de la cuenta */
    private double saldo;
    /** Tipo de interés de la cuenta */
    private double tipoInteres;

    /**
     * Constructor vacío por defecto.
     */
    public CCuenta()
    {
    }

    /**
     * contructor con paramaetros para inicializar la cuenta.
     * @param nom nombre de la cuenta
     * @param cue número de cuenta
     * @param sal saldo inicial
     * @param tipo tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        this.tipoInteres=tipo;
    }

    /**
     * Devuelve el saldo actual de la cuenta
     * @return saldo actual
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Ingresa una cantidad en la cuenta
     * @param cantidad cantidad a ingresar
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de la cuenta
     * @param cantidad cantidad a retirar
     * @throws Exception si la cantidad es negativa o no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    // getters
    public String getString(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getCuenta(){
        return cuenta;
    }
    public void setCuenta(String cuenta){
        this.cuenta = cuenta;
    }
    
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getTipoInteres(){
        return tipoInteres;
    }
    public void setTipoInteres(double tipoInteres){
        this.tipoInteres = tipoInteres;
    }
}
