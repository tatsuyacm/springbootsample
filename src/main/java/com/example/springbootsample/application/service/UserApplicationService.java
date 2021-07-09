package com.example.springbootsample.application.service;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
public class UserApplicationService {

    @Autowired
    private MessageSource messageSource;
    
    /** 性別のMapを生成する */
    public Map<String, Integer> getGenderMap(Locale locale){
        Map<String, Integer> genderMap = new LinkedHashMap<>();
        String male = messageSource.getMessage("male", null, locale);
        String female = messageSource.getMessage("female", null, locale);
        String other = messageSource.getMessage("other", null, locale);
        genderMap.put(male, 1);
        genderMap.put(female, 2);
        genderMap.put(other, 3);
        return genderMap;
    }
}
