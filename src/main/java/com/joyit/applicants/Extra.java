package com.joyit.applicants;

import com.joyit.applicants.infra.out.persistence.repository.GenderRepository;
import com.joyit.applicants.infra.out.persistence.repository.ApplicantRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Extra implements InitializingBean {
    private final ApplicantRepository extra;
    private final GenderRepository genderRepository;

    public Extra(ApplicantRepository extra, GenderRepository genderRepository){
        this.extra = extra;
        this.genderRepository = genderRepository;
    }

    @Override
    public void afterPropertiesSet() throws Exception{
//        this.genderRepository.save(new GenderEntity("Male", 1));
//        this.genderRepository.save(new GenderEntity("Female", 1));
////
//        this.extra.save(new PostulanteEntity(5,"Juanjito", "Pinto", genderRepository.getReferenceById(202), 1));
    }
}
