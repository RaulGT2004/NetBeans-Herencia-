package ejercicioherencia;

public class Cuenta {

    private String numero;
    private String titular;
    protected double saldo;
    protected boolean bloqueada;

    public Cuenta(String numC, String tituC) {
        numero = numC;
        titular = tituC;
        saldo = 0;
        bloqueada = false;
    }

    public double consultarSaldo() {
        if (!bloqueada) {
            return saldo;
        } else {
            return 0;
        }
    }

    public void ingresarDinero(double cantidad) {
        if (!bloqueada) {
            saldo += cantidad;
            System.out.println("Hecho nueva cantidad: " + saldo + "$");
        } else {
            System.out.println("La cuenta esta bloqueada.");
        }
    }

    protected void retirarDinero(double cantidad) {
        if (!bloqueada) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Hecho nueva cantidad: " + saldo + "$");
            } else {
                System.out.println("La cantidad que desea retirar es mayor al saldo de la cuenta.");
            }
        } else {
            System.out.println("La cuenta esta bloqueada.");
        }
    }

    public void cambioTitular(String nuevoTitular) {
        if (!bloqueada) {
            if (!nuevoTitular.equals("")) {
                titular = nuevoTitular;
                System.out.println("Cambio realizado.");
            } else {
                System.out.println("El nombre no es valido.");
            }
        } else {
            System.out.println("La cuenta esta bloqueada.");
        }
    }

    public void bloquear() {
        if (bloqueada = true) {
            System.out.println("La cuenta ya estaba bloqueada");
        } else {
            bloqueada = true;
            System.out.println("Cuenta bloqueada");
        }
    }

    public void desbloquear() {
        if (bloqueada = false) {
            System.out.println("La cuenta no estaba bloqueada");
        } else {
            bloqueada = false;
            System.out.println("Cuenta desbloqueada");
        }
    }

    public void imprimirDatos() {
        System.out.println("DATOS DE CUENTA:");
        System.out.println("NÚMERO: " + numero);
        System.out.println("TITULA: " + titular);
        System.out.println("SALDO: " + saldo + "$");
        if (bloqueada) {
            System.out.println("ESTADO: BLOQUEADA");
        } else {
            System.out.println("ESTADO: DESBLOQUEADA");
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + ", bloqueada=" + bloqueada + '}';
    }
    
}
