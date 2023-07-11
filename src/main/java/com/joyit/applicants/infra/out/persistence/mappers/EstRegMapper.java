package com.joyit.applicants.infra.out.persistence.mappers;

import com.joyit.applicants.infra.out.persistence.entitys.EstRegEntity;
import com.joyit.applicants.domain.models.EstReg;

public class EstRegMapper {
    public static EstReg entityToDomain(EstRegEntity estRegEntity){
        EstReg estReg = new EstReg();
        estReg.setId(estRegEntity.getId());
        estReg.setValue(estRegEntity.getValue());
        estReg.setEstReg(estRegEntity.getEstReg());
        return estReg;
    }

    public static EstRegEntity domainToEntity(EstReg estReg){
        EstRegEntity estRegEntity = new EstRegEntity();
        estRegEntity.setId(estReg.getId());
        estRegEntity.setValue(estReg.getValue());
        estRegEntity.setEstReg(estReg.getEstReg());
        return estRegEntity;
    }
}
