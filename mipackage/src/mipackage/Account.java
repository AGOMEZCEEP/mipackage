/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mipackage;

/**
 *
 * @author Nayra Deniz
 */
public class Account {

	// Atributos de la clase Account
	private String titular;
	private String ccc;
	private double balance = 0;

	// Constructor
	public Account(String nom, String cuenta) {
		this.setTitular(nom);
		this.setCcc(cuenta);
	}

	// M�todo que me devuelve el saldo disponible en cada momento
	public double disponible() {
		return getBalance();
	}

	/*
	 * M�todo para ingresar cantidades en la cuenta. Modifica el saldo.
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setBalance(getBalance() + cantidad);
	}

	/*
	 * Metodo para retirar cantidades en la cuenta. Modifica el saldo.
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede retirar una cantidad negativa.");
		if (disponible() < cantidad)
			throw new Exception("No hay suficiente saldo para retirar la cantidad solicitada.");
		setBalance(getBalance() - cantidad);
	}

	Account(int i) {
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCcc() {
		return ccc;
	}

	public void setCcc(String ccc) {
		this.ccc = ccc;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

}
