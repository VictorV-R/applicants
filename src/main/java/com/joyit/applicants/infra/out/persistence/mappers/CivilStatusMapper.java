package com.joyit.applicants.infra.out.persistence.mappers;

import com.joyit.applicants.domain.models.CivilStatus;
import com.joyit.applicants.infra.out.persistence.entitys.CivilStatusEntity;

public class CivilStatusMapper {
    public static CivilStatus entityToDomain(CivilStatusEntity civilStatusEntity){
        CivilStatus civilStatus = new CivilStatus();
        civilStatus.setId(civilStatusEntity.getId());
        return civilStatus;
    }
    public static CivilStatusEntity domainToEntity(CivilStatus civilStatus){
        CivilStatusEntity civilStatusEntity = new CivilStatusEntity();
        civilStatusEntity.setId(civilStatus.getId());
        return civilStatusEntity;
    }
}
