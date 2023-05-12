import org.junit.jupiter.api.Test;

import java.util.Observable;

import static org.junit.jupiter.api.Assertions.*;


public class UsuarioTest {
    @Test
    void deveNotificarUmCliente(){
        ContaMicrosoft contaMicrosoft = new ContaMicrosoft();
        Usuario usuario = new Usuario("Gabriel Lima") {
            @Override
            public void update(Observable o, Object arg) {

            }
        };
        usuario.cadastrar(new ContaMicrosoft());
        contaMicrosoft.transferirDados
                ();
        assertEquals("Gabriel, transferencia da conta realizada na ContaMicrosoft{nomeUsuario=Gabriel Lima, email=gg23@gmail.com, numeroSenha=1234, numeroCPF=1234567891}", usuario.getNotificacao());
    }

    @Test
    void deveNotificarClientes(){
        ContaMicrosoft contaMicrosoft1 = new ContaMicrosoft();
        ContaMicrosoft contaMicrosoft2 = new ContaMicrosoft();
        Usuario usuario1 = new Usuario("Joana Barbosa") {
            @Override
            public void update(Observable o, Object arg) {

            }
        };
        Usuario usuario2 = new Usuario("Joao Silva") {
            @Override
            public void update(Observable o, Object arg) {

            }
        };
        usuario1.cadastrar(contaMicrosoft1);
        usuario2.cadastrar(contaMicrosoft2);
        contaMicrosoft1.transferirDados();
        contaMicrosoft2.transferirDados();
        assertEquals("Joana Barbosa, transferencia da conta realizada na ContaMicrosoft{nomeUsuario= Joana Barbosa, emailUsuario=jb25@gmail.com, numeroSenha=1345, numeroCPF=1456789467}", usuario1.getNotificacao());
        assertEquals("Joao Silva, transferencia da conta realizada na ContaMicrosoft{nomeUsuario=Joao Silva, emailUsuario=js20@gmail.com, numeroSenha=1666, numeroCPF=1875959488}", usuario2.getNotificacao());
    }
    @Test
    void napDeveNotificarCliente(){
        ContaMicrosoft contaMicrosoft = new ContaMicrosoft();
        Usuario usuario = new Usuario("Gabriel Gomes") {
            @Override
            public void update(Observable o, Object arg) {

            }
        };
        usuario.cadastrar(contaMicrosoft);
        contaMicrosoft.transferirDados();
        assertEquals(null, usuario.getNotificacao());
    }
    void deveNotificarClientesMicrosoft(){
        ContaMicrosoft contaMicrosoft1 = new ContaMicrosoft();
        ContaMicrosoft contaMicrosoft2 = new ContaMicrosoft();
        Usuario usuario1 = new Usuario("Joana Barbosa") {
            @Override
            public void update(Observable o, Object arg) {

            }
        };
        Usuario usuario2 = new Usuario("Joao Silva") {
            @Override
            public void update(Observable o, Object arg) {

            }
        };
        usuario1.cadastrar(contaMicrosoft1);
        usuario2.cadastrar(contaMicrosoft2);
        contaMicrosoft2.transferirDados();
        assertEquals(null, usuario1.getNotificacao());
        assertEquals("Ana Beatriz, transferencia da conta realizada ao ContaMicrosoft{nomeUsuario=Joao Silva, emailUsuario=js20@gmail.com, numeroSenha=1666, numeroCPF=1875959488}", usuario2.getNotificacao());
    }
}
