package br.com.pehenmo.camel.redis.processor;

import br.com.pehenmo.camel.redis.model.Todos;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RedisWriteProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {

        String body = exchange.getIn().getBody(String.class);
        ObjectMapper objectMapper = new ObjectMapper();
        Todos todos = objectMapper.readValue(body, Todos.class);
        exchange.getIn().setBody(todos);

        //log.info("The response code is: {}", exchange.getIn().getHeader(Exchange.HTTP_RESPONSE_CODE));
        //log.info("Reponse Body is {}", exchange.getIn().getBody());

    }
}
