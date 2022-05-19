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
        Cliente t2 = new Cliente("Thiago Silva");
        Conta c2 = new Conta(t2, TipoConta.POUPANCA, Agencia.BEIRA_MAR);
        c2.depositar(10000);

        Conta c1 = new Conta(t1, TipoConta.CORRENTE, Agencia.CENTRO);
        System.out.println(c1);

        c1.depositar(200.0);
        c1.sacar(50);
        c2.transferir(c1, 400);
        c1.imprimirExtrato();








    }



    
}
