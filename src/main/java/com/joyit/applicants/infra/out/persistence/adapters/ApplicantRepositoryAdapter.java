package com.joyit.applicants.infra.out.persistence.adapters;

import com.joyit.applicants.domain.models.Applicant;
import com.joyit.applicants.domain.ports.out.ApplicantRepositoryPort;
import com.joyit.applicants.infra.out.persistence.entitys.ApplicantEntity;
import com.joyit.applicants.infra.out.persistence.mappers.ApplicantMapper;
import com.joyit.applicants.infra.out.persistence.repository.ApplicantRepository;
import org.springframework.stereotype.Component;

@Component
public class ApplicantRepositoryAdapter implements ApplicantRepositoryPort {
    private final ApplicantRepository applicantRepository;

    public ApplicantRepositoryAdapter(ApplicantRepository applicantRepository){
        this.applicantRepository = applicantRepository;
    }

    @Override
    public Applicant save(Applicant applicant){
        ApplicantEntity applicantEntity = ApplicantMapper.domainToEntity(applicant);
        ApplicantEntity savedApplicantEntity = applicantRepository.save(applicantEntity);
        return ApplicantMapper.entityToDomain(savedApplicantEntity);
    }
}
