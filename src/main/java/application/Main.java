package application;

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
        
    }
}

