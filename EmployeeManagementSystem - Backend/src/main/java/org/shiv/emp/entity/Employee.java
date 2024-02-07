package org.shiv.emp.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="emp_info")
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name="emp_FirstName")
    private String firstName;
    @Column(name="emp_LastName")
    private String lastName;
    @Column(name="emp_email")
    private String email;
}
