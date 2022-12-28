package com.azazel.greetresponse;

import com.azazel.model.Person;

import java.util.List;

public record GreetResponse(String greeting, List<String> favProgLang, Person person) {

}
