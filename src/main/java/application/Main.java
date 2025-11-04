package application;

public class Main {
    public static void main(String[] args) {
       NotificacaoSms notSMS = new NotificacaoSms("Luis", "14997547353", "Mensagem teste", 1);
    
        notSMS.exibirInformacoesRemetente();
        notSMS.enviar();
        notSMS.registrarLog();
        notSMS.definirPrioridade(3);
        notSMS.obterNivelPrioridade();
    }
}

