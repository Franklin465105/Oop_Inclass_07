package ie.atu.oop_inclass_07.Controller;


import ie.atu.oop_inclass_07.Model.Loan;
import ie.atu.oop_inclass_07.Service.LoanService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoanController {

    private final LoanService loanService;
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping("/addLoan")
    public ResponseEntity<Loan> addLoan(@Valid @RequestBody Loan loan) {

        Loan savedLoan = loanService.addLoan(loan);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedLoan);
    }

    @GetMapping("/allLoans")
    public ResponseEntity<List<Loan>> getLoans() {

    }



}
