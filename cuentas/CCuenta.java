package cuentas;
public class CCuenta {

	/**
	 * Atributos de la clase Cuenta
	 */
	
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    /*
     * Metodos constructores
     */
    
    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    /*
     * @return devuelve el saldo
     */

    public double estado()
    {
        return getSaldo();
    }
    
    /*
     * Metodo ingresar
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /*
     * Mtodo Retirar
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    /*
     * @return devuelve el nombre
     */

	private String getNombre() {
		return nombre;
	}
	
	/*
	 * modifica nombre
	 */

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/*
     * @return devuelve la cuenta
     */

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/*
     * @return devuelve el saldo
     */

	private double getSaldo() {
		return saldo;
		
		/*
		 * modifica el saldo
		 */
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/*
     * @return devuelve el tipo de interes
     */

	private double getTipoInteres() {
		return tipoInteres;
	}
	
	/*
	 * modifica el tipo deinteres
	 */

	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
