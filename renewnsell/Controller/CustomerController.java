package com.example.renewnsell.Controller;

import com.example.renewnsell.DTO.CustomerDTO;
import com.example.renewnsell.Service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/add")
    public ResponseEntity addProfile(@RequestBody @Valid CustomerDTO customerDTO) {
        customerService.register(customerDTO);
        return ResponseEntity.ok("customer added");
    }

    @GetMapping("/total-customers")
    public ResponseEntity totalMaleCustomers() {
        return ResponseEntity.status(HttpStatus.OK).body(customerService.totalCustomers());
    }

    @GetMapping("/total-customers-by-gender/{gender}")
    public ResponseEntity totalFemalesCustomers(@AuthenticationPrincipal @PathVariable String gender) {
        return ResponseEntity.status(HttpStatus.OK).body(customerService.totalCustomersByGender(gender));
    }


}
