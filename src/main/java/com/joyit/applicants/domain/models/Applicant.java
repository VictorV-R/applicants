package com.joyit.applicants.domain.models;

import lombok.Data;

@Data
public class Applicant {
    // Identifier
    private int id;
    // Personal Information
    private String name;
    private String lastName;
    //private Date birthday;
    private Gender gender;
    private CivilStatus civilStatus;
    private boolean driverLicense;
    private boolean ownMobility;
    private DocumentIdentifier documentIdentifier;

    // Contact Information
    private CellPhone cellPhone;
    private CellPhone secodCellPhone;
    private String email;
    private UserLocation userLocation;

    // Education
    //private List<AcademicTrainig> academicTrainig;

    // Estado de Registro
    private EstReg estReg;
}

