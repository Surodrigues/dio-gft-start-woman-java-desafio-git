package dio.gt.suely;

public class Cliente {
    
    private int id;
    private String titular;
    private int cont=0;

    public Cliente(String titular) {
        this.id = cont++;
        this.titular = titular;
    }

    public int getId() {
        return id;
    }
    

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", titular=" + titular + "]";
    }







    


}
