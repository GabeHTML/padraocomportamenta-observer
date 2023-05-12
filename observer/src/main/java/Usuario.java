import java.util.Objects;
import java.util.Observable;
import java.util.Observer;

public abstract class Usuario implements Observer{
    private String nome;
    private String notificacao;

    public Usuario(String nome){
        this.nome = nome;
    }

    public String getNotificacao(){
        return this.notificacao;
    }

    public void cadastrar(ContaMicrosoft conta){
        conta.addObserver(this);
    }

    public void update(Observable conta, Objects arg1){
        this.notificacao = this.nome + ", transferencia da conta realizada na" + conta.toString();
    }
}
