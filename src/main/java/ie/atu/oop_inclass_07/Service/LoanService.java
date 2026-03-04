package ie.atu.oop_inclass_07.Service;


import ie.atu.oop_inclass_07.Model.Loan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

    private final List<Loan> Loans = new ArrayList<>();
    private long nextId = 1;
}
