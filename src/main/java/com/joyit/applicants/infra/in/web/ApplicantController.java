package com.joyit.applicants.infra.in.web;

import com.joyit.applicants.application.service.ApplicantService;
import com.joyit.applicants.domain.models.Applicant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/postulantes")
public class ApplicantController {
    private final ApplicantService applicantService;

    private ApplicantController(ApplicantService applicantService){
        this.applicantService = applicantService;
    }

    @GetMapping
    public List<Applicant> all(){
        List<Applicant> applicants = applicantService.findAllApplicant();
        return new ResponseEntity<>(applicants, HttpStatus.FOUND).getBody();

    }

    @PostMapping
    public ResponseEntity<Applicant> createPostulante(@RequestBody Applicant applicant) {
        Applicant createdApplicant = applicantService.createApplicant(applicant);
        return new ResponseEntity<>(createdApplicant, HttpStatus.CREATED);
    }
}
