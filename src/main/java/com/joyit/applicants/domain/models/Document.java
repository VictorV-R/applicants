package com.joyit.applicants.domain.models;

import lombok.Data;

import java.io.File;

@Data
public class Document {
    private int id;
    private File file;
    private EstReg estReg;
}
