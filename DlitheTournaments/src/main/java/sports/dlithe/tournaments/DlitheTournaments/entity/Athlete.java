package sports.dlithe.tournaments.DlitheTournaments.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


/*
 entity relationship
 1 to 1
  1 to many
  many to 1
  many to 1
 */
@Entity
public class Athlete {
 
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int enrolId;
	private String name;
	private long contactNo;
	private double weight;
	@ManyToOne
	private Tournament tournament;
	
	public int getEnrolId() {
		return enrolId;
	}
	public void setEnrolId(int enrolId) {
		this.enrolId = enrolId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Tournament getTournament() {
		return tournament;
	}
	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
	}

	
	
}
