package application;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
       NotificacaoSms notSMS = new NotificacaoSms("Luis", "14997547353", "Mensagem teste", 1);
    
        notSMS.exibirInformacoesRemetente();
        notSMS.enviar();
        notSMS.registrarLog();
        notSMS.definirPrioridade(3);
        notSMS.obterNivelPrioridade();

        Notificacao notificacao = new NotificacaoSms("Fulano", "14997547353","Testando",3);
        notificacao.exibirInformacoesRemetente();
        notificacao.enviar();
        
        Priorizavel objPriorizavel = new NotificacaoSms("Ciclano", "14997547353", "Novo Teste", 2);
        objPriorizavel.definirPrioridade(6);
        
        objPriorizavel = new NotificacaoEmail("Beltrano", "beltrano@Gmaiil", "Triste", "Olá mundo", 3);
       
        Arquivavel objArquivavel = new NotificacaoEmail("Beltrano", "beltrano@Gmaiil", "Triste", "Olá mundo", 3);
        ((Notificacao) objArquivavel).enviar();
        
        System.out.println("=======");
        List<Priorizavel> objetos = new ArrayList<Priorizavel>();

        objetos.add(objPriorizavel);

        objetos.add(new NotificacaoSms("Ciclano", "14997547353", "Novo Teste", 2));
        objetos.add(new NotificacaoSms("Luis", "14997547353", "Novo Teste", 2));

        for(Priorizavel item : objetos){
            System.out.println(item.obterNivelPrioridade());
        }
        
    }
}

