package com.joyit.applicants.infra.out.persistence.mappers;

import com.joyit.applicants.infra.out.persistence.entitys.GenderEntity;
import com.joyit.applicants.domain.models.Gender;

public class GenderMapper {
    public static Gender entityToDomain(GenderEntity genderEntity){
        Gender gender = new Gender();
        gender.setId(genderEntity.getId());
//        gender.setValue(genderEntity.getValue());
//        gender.setEstReg(EstRegMapper.entityToDomain(genderEntity.getEstRegEntity()));
        return gender;
    }

    public static GenderEntity domainToEntity(Gender gender){
        GenderEntity genderEntity = new GenderEntity();
        genderEntity.setId(gender.getId());
//        genderEntity.setValue(gender.getValue());
//        genderEntity.setEstRegEntity(EstRegMapper.domainToEntity(gender.getEstReg()));
        return genderEntity;
    }
}
