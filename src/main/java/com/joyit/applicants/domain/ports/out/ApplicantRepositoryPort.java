package com.joyit.applicants.domain.ports.out;

import com.joyit.applicants.domain.models.Applicant;

public interface ApplicantRepositoryPort {
    Applicant save(Applicant applicant);
}
