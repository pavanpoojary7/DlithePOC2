package sports.dlithe.tournaments.DlitheTournaments.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sports.dlithe.tournaments.DlitheTournaments.repository.TournamentRepository;

@Service
public class TournamentService {
	@Autowired
	TournamentRepository trepo;

}
