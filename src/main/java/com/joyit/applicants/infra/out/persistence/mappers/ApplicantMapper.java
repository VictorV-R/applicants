package com.joyit.applicants.infra.out.persistence.mappers;

import com.joyit.applicants.infra.out.persistence.entitys.ApplicantEntity;
import com.joyit.applicants.domain.models.Applicant;

public class ApplicantMapper {
    public static Applicant entityToDomain(ApplicantEntity applicantEntity){
        Applicant applicant = new Applicant();
        applicant.setId(applicantEntity.getId());
        applicant.setName(applicantEntity.getName());
        applicant.setLastName(applicantEntity.getLastName());
        applicant.setGender(GenderMapper.entityToDomain(applicantEntity.getGenderEntity()));
        applicant.setCivilStatus(CivilStatusMapper.entityToDomain(applicantEntity.getCivilStatusEntity()));
        applicant.setEstReg(EstRegMapper.entityToDomain(applicantEntity.getEstRegEntity()));
        return applicant;
    }

    public static ApplicantEntity domainToEntity(Applicant applicant){
        ApplicantEntity applicantEntity = new ApplicantEntity();
        applicantEntity.setId(applicant.getId());
        applicantEntity.setName(applicant.getName());
        applicantEntity.setLastName(applicant.getLastName());
        applicantEntity.setGenderEntity(GenderMapper.domainToEntity(applicant.getGender()));
        applicantEntity.setCivilStatusEntity(CivilStatusMapper.domainToEntity(applicant.getCivilStatus()));
        applicantEntity.setEstRegEntity(EstRegMapper.domainToEntity(applicant.getEstReg()));
        return applicantEntity;
    }
}
