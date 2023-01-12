package ejercicioherencia;

public class EjercicioHerencia {

    public static void main(String[] args) {
        /*CuentaAhorro C = new CuentaAhorro("323232","Pedro Sanchez Llamas",2.5);
        C.ingresarDinero(1000);
        C.setIntereses(3);
        C.aplicarInteres();
        C.imprimirDatos();
        C.retirarDinero(2000);
        C.cambioTitular("Ana Perez Resa");
        C.imprimirDatos();*/
        
        /*CuentaCredito C = new CuentaCredito("323232","Pedro Sanchez Llamas",-3000);
        C.ingresarDinero(1000);
        C.imprimirDatos();
        C.retirarDinero(2000);
        C.cambioTitular("Ana Perez Resa");
        C.imprimirDatos();*/
        
        CuentaAhorro CA = new CuentaAhorro("323232","Pedro Sanchez Llamas",2.5);
        CuentaCredito CC = new CuentaCredito("323232","Pedro Sanchez Llamas",-3000);
        Cuenta C = new Cuenta("323232","Pedro Sanchez Llamas");
        System.out.println(C.toString());
        System.out.println(CA.toString());
        System.out.println(CC.toString());
    }
    
}
