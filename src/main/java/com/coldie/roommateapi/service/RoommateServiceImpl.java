package com.coldie.roommateapi.service;

import com.coldie.roommateapi.entity.Roommate;
import com.coldie.roommateapi.repository.RoommateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoommateServiceImpl implements RoomateService {
    @Autowired
    RoommateRepository roommateRepository;

    @Override
    public List<Roommate> retrieveAllRoommate() {
        return (List<Roommate>) roommateRepository.findAll();
    }

    @Override
    public Optional<Roommate> retrieveRoommateById(Long id) {
        return roommateRepository.findById(id);
    }

    @Override
    public List<Roommate> retrieveRoommateByLevel(int level) {
        return roommateRepository.findRoommateByLevel(level);
    }

    @Override
    public List<String> retrieveRoommateByIdAsString(Long id) {
        return roommateRepository.findRoommateByIdAsString(id);
    }
}
