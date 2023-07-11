package com.joyit.applicants.infra.in.web;

import com.joyit.applicants.application.service.ApplicantService;
import com.joyit.applicants.domain.models.Applicant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/postulantes")
public class ApplicantController {
    private final ApplicantService applicantService;

    private ApplicantController(ApplicantService applicantService){
        this.applicantService = applicantService;
    }

    @PostMapping
    public ResponseEntity<Applicant> createPostulante(@RequestBody Applicant applicant){
        Applicant createdApplicant = applicantService.createPostulante(applicant);
        return new ResponseEntity<>(createdApplicant, HttpStatus.CREATED);
    }

}
