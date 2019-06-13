package edu.mum.cs.lesson10.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

//    @NotEmpty(message="name cannot be empty")
    @Size(min=6, message = "name greater than 6" )
    private String name;

    private double salary;

    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    private Address address;
}
