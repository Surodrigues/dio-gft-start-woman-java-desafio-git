package dio.gt.suely;

public class Conta {
    //atributos
    private Cliente cliente;
    private TipoConta tipoConta;
    private Agencia agencia;
    private long numConta;
    private double saldo;
    private static long cont = 0001;

    //métodos
    public void sacar(double valor){
        saldo -= valor;
    }
    public void depositar(double valor){
        saldo+=valor;
    }
    public void transferir(Conta destino, double valor){
        this.sacar(valor);
        destino.depositar(valor);
    }
    public void imprimirExtrato(){
        System.out.println("===== EXTRATO CONTA "+ this.getTipoConta() +" Nº "+this.getNumConta()+" =====");
        System.out.println("Titular: "+ this.cliente.getTitular());
        System.out.println("Saldo: R$"+ this.getSaldo());
        System.out.println("=======================================");
    }

    
    //construtor
    public Conta(Cliente cliente, TipoConta tipoConta, Agencia agencia) {
        this.cliente = cliente;
        this.tipoConta = tipoConta;
        this.agencia = agencia;
        this.numConta = cont++;
        this.saldo = saldo;
    }

    //getters e setters
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Agencia getAgencia() {
        return agencia;
    }
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public long getNumConta() {
        return numConta;
    }
    

    public double getSaldo() {
        return saldo;
    }


    //toString
    @Override
    public String toString() {
        return "Conta [cliente=" + cliente.getTitular() + ", agencia=" + agencia + ", numConta=" + numConta + ", tipoConta=" + tipoConta + ", saldo=" + saldo + "]";
    }

    
    
    


}
