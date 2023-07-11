package com.joyit.applicants.infra.out.persistence.entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "est_reg")
public class EstRegEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    private String value;
    private int estReg;

    @OneToMany(mappedBy = "estRegEntity")
    private Set<CivilStatusEntity> civilStatusEntitySet;
    @OneToMany(mappedBy = "estRegEntity")
    private Set<GenderEntity> genderEntitySet;
    @OneToMany(mappedBy = "estRegEntity")
    private Set<ApplicantEntity> applicantEntitySet;
}
