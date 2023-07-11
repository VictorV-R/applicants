package com.joyit.applicants.domain.models;

import lombok.Data;

@Data
public class CivilStatus {
    private int id;
    private String value;
    private EstReg estReg;
}
