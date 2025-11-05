package com.example.employeemanagement.dto;

import lombok.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDTO {
    private Long id;
    
    @NotBlank(message = "First name is required")
    private String firstName;
    
    @NotBlank(message = "Last name is required")
    private String lastName;
    
    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
    private String email;
    
    @NotBlank(message = "Phone number is required")
    private String phoneNumber;
    
    @NotNull(message = "Hire date is required")
    private LocalDate hireDate;
    
    @NotBlank(message = "Department is required")
    private String department;
    
    @NotBlank(message = "Position is required")
    private String position;
    
    @Min(value = 0, message = "Salary must be positive")
    private Double salary;
    
    private Boolean isActive;
}
