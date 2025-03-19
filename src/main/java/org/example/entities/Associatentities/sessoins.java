package org.example.entities.Associatentities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.entities.Patient;
import org.example.entities.Therapist;

import java.sql.Date;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class sessoins {
//    @EmbeddedId
    @Id
    private String sessionIds;

    @ManyToOne
    @JoinColumn(name = "patient_Id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "therapist_Id")
    private Therapist therapist;

    private LocalTime checkInTime;
    private LocalTime checkOutTime;
    private Date date;
}
