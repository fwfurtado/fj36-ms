package br.com.caelum.ms.configuration;

import br.com.caelum.ms.configuration.EventDrivenConfigurations.Binders;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.MessageChannel;

@Configuration
@EnableBinding(Binders.class)
public class EventDrivenConfigurations {

    public final static String AUTHOR_CHANNEL = "authors";

    interface Binders {

        @Output(AUTHOR_CHANNEL)
        MessageChannel channel();
    }

}
