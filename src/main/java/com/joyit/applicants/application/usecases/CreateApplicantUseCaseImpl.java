package com.joyit.applicants.application.usecases;

import com.joyit.applicants.domain.models.Applicant;
import com.joyit.applicants.domain.ports.in.CreateApplicantUseCase;
import com.joyit.applicants.domain.ports.out.ApplicantRepositoryPort;

public class CreateApplicantUseCaseImpl implements CreateApplicantUseCase {

    private final ApplicantRepositoryPort applicantRepositoryPort;

    public CreateApplicantUseCaseImpl(ApplicantRepositoryPort applicantRepositoryPort){
        this.applicantRepositoryPort = applicantRepositoryPort;
    }

    @Override
    public Applicant createPostulante(Applicant applicant){
        return applicantRepositoryPort.save(applicant);
    }

}
