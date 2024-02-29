package br.com.ebac.ebac.demo.consumidor;

import br.com.ebac.ebac.demo.configuracao.ConfiguracaoRabbitMQ;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = ConfiguracaoRabbitMQ.NOME_FILA)
public class Consumidor {
    @RabbitHandler
    public void consumidorMensagem(String mensagem){
        System.out.println("==============Recebber mensagem===============");

        System.out.println("===========" + mensagem);

        System.out.println("==============FIM da Mensagem ===========");
    }

}
