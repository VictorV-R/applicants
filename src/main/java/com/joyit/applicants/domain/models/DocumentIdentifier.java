package com.joyit.applicants.domain.models;

import lombok.Data;

@Data
public class DocumentIdentifier {
    private int id;
    private int idDocumentType;
    private int value;
    private EstReg estReg;
}
