package org.example.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.entities.Associatentities.sessoins;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Therapist {
    @Id
    private String therapist_Id;
    private String name;

    @Column(unique = true)
    private String email;

    private String address;
    private String contact;

    @ManyToMany
    private List<TherapyProgram> therapyPrograms;

    @OneToMany(mappedBy = "therapist")
    private List<sessoins> sessions;
}
