package ejercicioherencia;

public class CuentaAhorro extends Cuenta {

    private double intereses;

    public CuentaAhorro(String numC, String tituC, double intereses) {
        super(numC, tituC);
        if (intereses >= 0 && intereses <= 100) {
            this.intereses = intereses;
        } else {
            this.intereses = 0;
        }
    }

    public double getIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        if (!this.bloqueada) {
            if (intereses >= 0 && intereses <= 100) {
                this.intereses = intereses;
                System.out.println("Nuevo interes fijado: "+this.intereses+"%");
            } else {
                this.intereses = 0;
            }
        } else {
            System.out.println("La cuenta esta bloqueada.");
        }
    }

    public void aplicarInteres() {
        if (!this.bloqueada) {
            this.saldo=(this.saldo)*(1+this.intereses/ 100) ;
            System.out.println("El salario más intereses es: " +this.saldo);
        } else {
            System.out.println("La cuenta esta bloqueada.");
        }
    }

}
