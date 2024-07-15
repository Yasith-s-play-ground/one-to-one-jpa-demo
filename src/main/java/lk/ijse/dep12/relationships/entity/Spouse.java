package lk.ijse.dep12.relationships.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "spouse")
public class Spouse implements Serializable {
    @Id
    private String id;
    private String name;
    private String contact;
    @OneToOne
    @JoinColumn(name = "employee_id",referencedColumnName = "id") /* this is a
    special column joined with id column of employee table */
    private Employee employee; /* employeeId represents an employee entity */
}
