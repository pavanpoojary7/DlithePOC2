package sports.dlithe.tournaments.DlitheTournaments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sports.dlithe.tournaments.DlitheTournaments.entity.Athlete;

@Repository
public interface AthleteRepository extends JpaRepository<Athlete, Integer>{

}
