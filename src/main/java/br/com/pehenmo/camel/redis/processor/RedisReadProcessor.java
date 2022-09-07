package br.com.pehenmo.camel.redis.processor;

import br.com.pehenmo.camel.redis.model.Todos;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RedisReadProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        Todos todos = exchange.getIn().getBody(Todos.class);
        log.info("Hello from "+ todos.getTitle());
    }
}
