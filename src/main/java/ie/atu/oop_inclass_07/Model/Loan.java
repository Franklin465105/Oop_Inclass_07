package ie.atu.oop_inclass_07.Model;


import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Loan {

    private Long LoanID;

    @NotBlank(message = "Loan Tag is Required")
    private String LoanTag;

    @NotBlank(message = "Student Email is Required")
    @Email(message = "Email must be valid")
    private String StudentEmail;

    @NotNull(message = "Loan Date is required")
    private LocalDate LoanDate;

    @Min(value = 0, message = "Must be between 8 and 18")
    @Max(value = 0, message = "Must be between 8 and 18")
    private int StartHour;

    @Positive(message = "Must be over 0")
    private int DurationHours;


    public Object getLoanId() {
        return LoanID;
    }
}
