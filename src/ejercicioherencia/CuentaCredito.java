package ejercicioherencia;

public class CuentaCredito extends Cuenta {

    private double limCredito;

    public CuentaCredito(String numC, String tituC, double limCredito) {
        super(numC, tituC);
        if (limCredito >= 0) {
            this.limCredito = -1000;
        } else {
            this.limCredito = limCredito;
        }
    }

    public void retirarDinero(double cantidad) {
        if (!this.bloqueada) {
            if (this.saldo - cantidad >= this.limCredito) {
                this.saldo = this.saldo - cantidad;
            }
        } else {
            System.out.println("La cuenta esta bloqueada.");
        }
    }

}
