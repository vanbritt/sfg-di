package com.vanbritt.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("ES")
public class I18NSpanishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "HOLA Mundo -- ES";
    }
}
