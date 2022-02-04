package sports.dlithe.tournaments.DlitheTournaments.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sports.dlithe.tournaments.DlitheTournaments.entity.Athlete;
import sports.dlithe.tournaments.DlitheTournaments.repository.AthleteRepository;

@Service
public class AthleteService {
 @Autowired
 AthleteRepository arepo;
 
 public String enroll(Athlete athlete)
	{
		return arepo.save(athlete).getName()+" has enrolled the "+athlete.getTournament().getName();
	}
}

