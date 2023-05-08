package com.vanbritt.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile({"EN", "default"})
public class I18NEnglishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World -- EN";
    }
}
