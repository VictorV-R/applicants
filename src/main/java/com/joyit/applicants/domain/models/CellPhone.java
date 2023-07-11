package com.joyit.applicants.domain.models;

import lombok.Data;

@Data
public class CellPhone {
    private int id;
    private int phoneCode;
    private int phoneNumber;
    private EstReg estReg;
}
