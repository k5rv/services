package com.example.fraud;

import com.example.clients.fraud.FraudCheckResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/fraud-check")
@AllArgsConstructor
public class FraudController {

  private final FraudCheckService fraudCheckService;

  @GetMapping(path = "{customerId}")
  public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId) {
    boolean isFraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerId);
    return new FraudCheckResponse(isFraudulentCustomer);
  }
}
