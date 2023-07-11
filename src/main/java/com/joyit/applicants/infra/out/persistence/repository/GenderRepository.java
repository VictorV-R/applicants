package com.joyit.applicants.infra.out.persistence.repository;

import com.joyit.applicants.infra.out.persistence.entitys.GenderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository extends JpaRepository<GenderEntity, Integer> {
}
