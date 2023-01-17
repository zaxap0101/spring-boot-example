package com.azazel.greetresponse.controllergretresponce;

import com.azazel.customerrepository.CustomerRepo;
import com.azazel.greetresponse.GreetResponse;
import com.azazel.greetresponse.servicegreetresponse.ServiceGreetResponse;
import com.azazel.model.Customer;
import com.azazel.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(path = "/api/v1")
public class ControllerGreetResponse {
    private final CustomerRepo customerRepo;
    private final ServiceGreetResponse serviceGreetResponse;

    @Autowired
    public ControllerGreetResponse(CustomerRepo customerRepo, ServiceGreetResponse serviceGreetResponse) {
        this.customerRepo = customerRepo;
        this.serviceGreetResponse = serviceGreetResponse;
    }
    @GetMapping
    public String greets(){
        return "greeting";
    }
    @GetMapping("/greet")
    public GreetResponse greet() {
        return serviceGreetResponse.getGreetResponse();
    }

    @GetMapping("/list")
    public List<Customer> getCustomer() {
        return customerRepo.findAll();
    }

    @GetMapping(value = "/get/{age}")
    public GreetResponse getCustomer(@PathVariable Integer age) {
        Person person = new Person("John", age, 1000.0);
        return new GreetResponse("BLYAT",
                List.of("Java, Kotlin"),
                person);
    }
}
