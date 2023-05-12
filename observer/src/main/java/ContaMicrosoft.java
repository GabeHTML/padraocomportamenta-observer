import java.util.Observable;
public class ContaMicrosoft extends Observable{
    private String nomeUsuario;
    private String emailUsuario;
    private Integer numeroSenha;
    private Integer numeroCPF;

    public ContaMicrosoft (){
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.numeroSenha = numeroSenha;
        this.numeroCPF = numeroCPF;
    }

    public void transferirDados(){
        setChanged();
        notifyObservers();
    }
    @Override
    public String toString(){
        return "ContaMicrosoft{"+
                "nomeUsuario"+ nomeUsuario +
                ",emailUsuario"+ emailUsuario +
                ",numeroSenha"+ numeroSenha + '\''+
                ",numeroCPF" + numeroCPF + '\''+
                '}';
    }
}
