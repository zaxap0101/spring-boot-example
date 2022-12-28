package com.azazel.greetresponse.servicegreetresponse;

import com.azazel.greetresponse.GreetResponse;
import com.azazel.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceGreetResponse {

    private GreetResponse greetResponse = new GreetResponse("BLYAT",
                                                            List.of("Java, Kotlin"),
                                                            new Person("John", 22, 1000.0));

    public GreetResponse getGreetResponse() {
        return greetResponse;
    }
}
