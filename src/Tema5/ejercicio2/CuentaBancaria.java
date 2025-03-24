package Tema5.ejercicio2;

public class CuentaBancaria {
    private Cliente cliente;
    private double saldo;
    private String numerocuenta;

    public CuentaBancaria(Cliente cliente, double saldo, String numerocuenta) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.numerocuenta = numerocuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }



    public boolean depositar(double dinero) {
        if (dinero > 0) {
            this.saldo += dinero; // Sumamos la cantidad al saldo actual
            return true;
        }

        return false;
    }




    public boolean transferencia(CuentaBancaria cuentadestino, double dinero) {
        if (this.saldo >= dinero) {
            this.saldo -= dinero;
            cuentadestino.depositar(dinero);
            return true;
        }
        return false;
    }




}
