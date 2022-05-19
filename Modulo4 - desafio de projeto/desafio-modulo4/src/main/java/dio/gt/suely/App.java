package dio.gt.suely;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Cliente t1 = new Cliente("Hosana Mendes");
        System.out.println(t1);

        Conta c1 = new Conta(t1, TipoConta.CORRENTE, Agencia.CENTRO);
        System.out.println(c1);

        c1.depositar(200.0);
        c1.imprimirExtrato();








    }



    
}
