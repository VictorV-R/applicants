package com.joyit.applicants.application.service;

import com.joyit.applicants.domain.models.Applicant;
import com.joyit.applicants.domain.ports.in.CreateApplicantUseCase;

public class ApplicantService implements CreateApplicantUseCase {
    private final CreateApplicantUseCase createApplicantUseCase;

    public ApplicantService(CreateApplicantUseCase createApplicantUseCase){
        this.createApplicantUseCase = createApplicantUseCase;
    }

    @Override
    public Applicant createApplicant(Applicant applicant){
        return createApplicantUseCase.createApplicant(applicant);
    }
}
