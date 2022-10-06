package com.hoxtonjavafootballers.hoxtonjavafootballers;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@Entity
public class Team {
    @Id
    @GeneratedValue
    public Integer id;
    public String name;

    public Team () {
    }
}

@RestController
class TeamController{
    @Autowired
    private TeamRepo teamRepo;

    @GetMapping("/teams")
    public List<Team> getAllTeams() {
        return teamRepo.findAll();
    }
}

interface TeamRepo extends JpaRepository<Team, Integer> {}