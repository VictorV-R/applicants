package com.joyit.applicants.infra.out.persistence.repository;

import com.joyit.applicants.infra.out.persistence.entitys.ApplicantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<ApplicantEntity, Integer> {
}
