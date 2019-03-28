package br.com.caelum.ms.configuration;

import br.com.caelum.ms.configuration.EventDrivenConfiguration.Binders;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.MessageChannel;

@Configuration
@EnableBinding(Binders.class)
public class EventDrivenConfiguration {

    public static final String AUTHORS_CHANNEL = "authors";

    interface Binders {
        @Input(AUTHORS_CHANNEL)
        MessageChannel channel();
    }
}
