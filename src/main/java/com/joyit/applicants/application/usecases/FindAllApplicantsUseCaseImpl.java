package com.joyit.applicants.application.usecases;

import com.joyit.applicants.domain.models.Applicant;
import com.joyit.applicants.domain.ports.in.FindAllApplicantsUseCase;
import com.joyit.applicants.domain.ports.out.ApplicantRepositoryPort;

import java.util.List;

public class FindAllApplicantsUseCaseImpl implements FindAllApplicantsUseCase {
    private final ApplicantRepositoryPort applicantRepositoryPort;

    public FindAllApplicantsUseCaseImpl(ApplicantRepositoryPort applicantRepositoryPort){
        this.applicantRepositoryPort = applicantRepositoryPort;
    }
    @Override
    public List<Applicant> findAllApplicant() {
        return applicantRepositoryPort.getApplicants();
    }
}
