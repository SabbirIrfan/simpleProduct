package com.dsi.project.service;

import com.dsi.project.model.AllUser;
import com.dsi.project.repository.AllUserRepository;
import org.springframework.stereotype.Service;

@Service
public class AllUserServiceImpl implements AllUserService{


    public AllUserRepository allUserRepository;

    public AllUserServiceImpl(AllUserRepository allUserRepository) {
        this.allUserRepository = allUserRepository;
    }

    @Override
    public void saveUserService(AllUser allUser) {
        allUserRepository.save(allUser);
    }
}