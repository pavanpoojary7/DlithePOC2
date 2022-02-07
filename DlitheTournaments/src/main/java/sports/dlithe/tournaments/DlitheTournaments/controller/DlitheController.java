package sports.dlithe.tournaments.DlitheTournaments.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sports.dlithe.tournaments.DlitheTournaments.entity.Athlete;
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
	public List<Tournament> readingMore()
	{
		return tservice.fetchingAll();
	}
	
	@PostMapping("/add")
	public String addingTour(@RequestBody Tournament tournament)
	{
		return tservice.newOne(tournament);
	}
	
	@PostMapping("/part")
	public String addingAth(@RequestBody Athlete athlete)
	{
		// adding athlete to the table of tournament in participants list
//		athlete.getTournament().getParticipants().add(athlete);
//		tservice.newOne(athlete.getTournament());
		String t = aservice.enroll(athlete);
		Tournament tour = tservice.fetchingOnlyOne(athlete.getTournament().getTournamentId());
		tour.getParticipants().add(athlete);
		tservice.newOne(tour);
		return t;
	}
	@PutMapping("/up/{winner}")
	public String yetToDecide(@PathVariable("winner") String winner, @RequestBody Tournament tournament)
	{
		tournament.setWinner(winner);
		String t = tservice.announce(tournament);
		return t+" winner is "+winner;
	}
}