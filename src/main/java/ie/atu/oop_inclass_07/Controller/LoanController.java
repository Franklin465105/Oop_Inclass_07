package ie.atu.oop_inclass_07.Controller;


import ie.atu.oop_inclass_07.Model.Loan;
import ie.atu.oop_inclass_07.Service.LoanService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        return ResponseEntity.ok(LoanService.getAllLoans());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Loan> getLoanById(@PathVariable long id) {
        return ResponseEntity.ok(LoanService.getLoanById(id));
    }
}

