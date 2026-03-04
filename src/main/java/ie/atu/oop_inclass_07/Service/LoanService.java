package ie.atu.oop_inclass_07.Service;


import ie.atu.oop_inclass_07.Model.Loan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class LoanService {

    private final List<Loan> Loans = new ArrayList<>();
    private long nextId = 1;
    private final AtomicLong idCounter = new AtomicLong();
    public Loan addLoan(Loan loan) {

        for (Loan existing : Loans) {
            if (existing.getLoanTag().equals(Loan.getLoanTag()) && existing.getLoanDate().equals(Loan.getLoanDate())

        int existingStart = existing.getStartHour();
        int existingEnd = existingStart + existing.getDurationHours();

        int newStart = Loan.getStartHour();
        int newEnd = existingEnd + Loan.getDurationHours();

        if (newStart < existingEnd && newEnd > existingStart) {
            throw new IllegalArgumentException("Loan already exists");
            }
        }
    }
      Loan.setLoanID(nextId++)
      Loans.add(Loan);
      return Loan;
}
