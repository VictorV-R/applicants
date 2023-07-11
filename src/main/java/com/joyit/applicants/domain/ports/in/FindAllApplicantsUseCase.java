package com.joyit.applicants.domain.ports.in;

import com.joyit.applicants.domain.models.Applicant;

import java.util.List;

public interface FindAllApplicantsUseCase {
    List<Applicant> findAllApplicant();
}
