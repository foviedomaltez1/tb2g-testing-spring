package org.springframework.samples.petclinic.sfg;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by jt on 2019-02-16.
 */
@Profile("base-test")
@Configuration
public class BaseConfig {

    @Bean
    HearingInterpreter hearingInterpreter(@Qualifier("laurelWordProducer") WordProducer wordProducer){
        return new HearingInterpreter(wordProducer);
    }
}
