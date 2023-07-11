package com.joyit.applicants.application.service;

import com.joyit.applicants.domain.models.Applicant;
import com.joyit.applicants.domain.ports.in.CreateApplicantUseCase;
import com.joyit.applicants.domain.ports.in.FindAllApplicantsUseCase;

import java.util.List;

public class ApplicantService implements CreateApplicantUseCase, FindAllApplicantsUseCase {
    private final CreateApplicantUseCase createApplicantUseCase;
    private final FindAllApplicantsUseCase findAllApplicantsUseCase;

    public ApplicantService(CreateApplicantUseCase createApplicantUseCase, FindAllApplicantsUseCase findAllApplicantsUseCase){
        this.createApplicantUseCase = createApplicantUseCase;
        this.findAllApplicantsUseCase = findAllApplicantsUseCase;
    }

    @Override
    public Applicant createApplicant(Applicant applicant){
        return createApplicantUseCase.createApplicant(applicant);
    }
    @Override
    public List<Applicant> findAllApplicant() {
        return findAllApplicantsUseCase.findAllApplicant();
    }
}
