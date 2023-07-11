package com.joyit.applicants.domain.models;

import lombok.Data;

@Data
public class UserLocation {
    private int id;
    private Country country;
    private Region region;
    private City city;
    private String address;
    private EstReg estReg;
}
