package com.example.demo.Controllers;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DatabaseDTO {

    @NotBlank
    @Size(min = 3, max = 18)
    private String product;

    @Min(1)
    @Max(10000)
    private int value;
    
}
