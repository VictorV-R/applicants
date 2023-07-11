package com.joyit.applicants.infra.out.persistence.entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "postulante")
public class ApplicantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    // Identifier
    private int id;
    // Personal Information
    private String name;
    private String lastName;
    //private Date birthday;
    @ManyToOne()
    @JoinColumn(name = "gender_id", nullable = false)
    private GenderEntity genderEntity;

    @ManyToOne()
    @JoinColumn(name = "civil_status_id", nullable = false)
    private CivilStatusEntity civilStatusEntity;

    @ManyToOne()
    @JoinColumn(name = "estReg", nullable = false)
    private EstRegEntity estRegEntity;


//    private boolean driverLicense;
//    private boolean ownMobility;
//    @Enumerated(EnumType.STRING)
//    private DocumentType documentType;
//    private int documentNumber;
//
//    // Contact Information
//    private CellPhone cellPhone;
//    private CellPhone secodCellPhone;
//    private String email;
//    private UserLocation address;
//
//    // Education
//    private List<AcademicTrainig> academicTrainig;
}
