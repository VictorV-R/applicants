package com.joyit.applicants.domain.ports.in;

import com.joyit.applicants.domain.models.Applicant;

public interface CreateApplicantUseCase {
    Applicant createApplicant(Applicant applicant);
}
