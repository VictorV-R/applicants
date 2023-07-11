package com.joyit.applicants.domain.ports.out;

import com.joyit.applicants.domain.models.Applicant;

import java.util.List;

public interface ApplicantRepositoryPort {
    Applicant save(Applicant applicant);
    List<Applicant> getApplicants();
}
