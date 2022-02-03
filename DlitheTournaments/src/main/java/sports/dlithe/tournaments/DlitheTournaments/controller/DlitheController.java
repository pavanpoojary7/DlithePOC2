package sports.dlithe.tournaments.DlitheTournaments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sports.dlithe.tournaments.DlitheTournaments.entity.Tournament;
import sports.dlithe.tournaments.DlitheTournaments.services.AthleteService;
import sports.dlithe.tournaments.DlitheTournaments.services.TournamentService;

@RestController
@CrossOrigin(origins ="http://localhost:3000")
public class DlitheController 
{
	@Autowired
	TournamentService tservice;
	@Autowired
	AthleteService aservice;
	
	@GetMapping("/")
	public String hai()
	{
		return "Project is working fine";
	}
	
	@PostMapping("/add")
	public String addingTour(@RequestBody Tournament tournament)
	{
		return tservice.newOne(tournament);
	}
}