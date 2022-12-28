package com.azazel.greetresponse.controllergretresponce;

import com.azazel.customerrepository.CustomerRepo;
import com.azazel.greetresponse.GreetResponse;
import com.azazel.greetresponse.servicegreetresponse.ServiceGreetResponse;
import com.azazel.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class ControllerGreetResponse {
    private final CustomerRepo customerRepo;
    private final ServiceGreetResponse serviceGreetResponse;

    public ControllerGreetResponse(CustomerRepo customerRepo, ServiceGreetResponse serviceGreetResponse) {
        this.customerRepo = customerRepo;
        this.serviceGreetResponse = serviceGreetResponse;
    }


    @GetMapping("/greet")
    public GreetResponse greet() {
        return serviceGreetResponse.getGreetResponse();
    }

    @GetMapping("/list")
    public List<Customer> getCustomer() {
        return customerRepo.findAll();
    }

}
