package com.coldie.roommateapi.service;

import com.coldie.roommateapi.entity.Roommate;

import java.util.List;
import java.util.Optional;

public interface RoomateService {
    List<Roommate> retrieveAllRoommate();
    Optional<Roommate> retrieveRoommateById(Long id);
    List<Roommate> retrieveRoommateByLevel(int level);
    List<String> retrieveRoommateByIdAsString(Long id);
}
