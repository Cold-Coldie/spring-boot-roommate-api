package com.coldie.roommateapi.web;

import com.coldie.roommateapi.entity.Roommate;
import com.coldie.roommateapi.repository.RoommateRepository;
import com.coldie.roommateapi.service.RoomateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class RoommateController {
    @Autowired
    RoomateService roomateService;

    @GetMapping("/roommates")
    public ResponseEntity<List<Roommate>> getAllRoommate() {
        List<Roommate> list = roomateService.retrieveAllRoommate();
        return new ResponseEntity<List<Roommate>>(list, HttpStatus.OK);
    }

    @GetMapping("/roommates/{id}")
    public ResponseEntity<Optional<Roommate>> getRoommateById(@PathVariable Long id) {
        Optional<Roommate> list = roomateService.retrieveRoommateById(id);
        return new ResponseEntity<Optional<Roommate>>(list, HttpStatus.OK);
    }

    @GetMapping("/roommates/level/{level}")
    public ResponseEntity<List<Roommate>> getRoommateByLevel(@PathVariable int level) {
        List<Roommate> list = roomateService.retrieveRoommateByLevel(level);
        return new ResponseEntity<List<Roommate>>(list, HttpStatus.OK);
    }

    @GetMapping("/roommate/{id}")
    public ResponseEntity<List<String>> getRoommateByIdAsString(@PathVariable Long id) {
        List<String> list = roomateService.retrieveRoommateByIdAsString(id);
        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }
}
