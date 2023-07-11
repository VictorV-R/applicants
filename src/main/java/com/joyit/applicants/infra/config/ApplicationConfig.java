package com.joyit.applicants.infra.config;

import com.joyit.applicants.application.service.ApplicantService;
import com.joyit.applicants.application.usecases.CreateApplicantUseCaseImpl;
import com.joyit.applicants.domain.ports.out.ApplicantRepositoryPort;
import com.joyit.applicants.infra.out.persistence.adapters.ApplicantRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public ApplicantService applicantService(ApplicantRepositoryPort applicantRepositoryPort){
        return new ApplicantService(
                new CreateApplicantUseCaseImpl(applicantRepositoryPort)
        );
    }

    @Bean
    public ApplicantRepositoryPort applicantRepositoryPort(ApplicantRepositoryAdapter applicantRepositoryAdapter){
        return applicantRepositoryAdapter;
    }

}
