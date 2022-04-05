package com.example.fraud;

import com.example.clients.fraud.FraudCheckResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(path = "api/v1/fraud-check")
@AllArgsConstructor
public class FraudController {

  private final FraudCheckService fraudCheckService;

  @GetMapping(path = "{customerId}")
  public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId) {
    boolean isFraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerId);
    log.info("fraud check request for customer {}", customerId);
    return new FraudCheckResponse(isFraudulentCustomer);
  }
}
