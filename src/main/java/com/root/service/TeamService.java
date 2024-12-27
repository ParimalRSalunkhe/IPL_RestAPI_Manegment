package com.root.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.root.dao.TeamDao;
import com.root.model.Team;

@Service
public class TeamService {

	@Autowired
	private TeamDao teamDao;
	
	public String addTeam(Team team){
		
	String msg = teamDao.addTeam(team);

	return msg;
	
	}
	public List<Team> getAllTeams(){
		
	List<Team> allTeams = teamDao.getAllTeams();
	
	return allTeams;
	}
	
	public Team getTeamById(int id) {
		Team team = teamDao.getTeamById(id);
		return team;
	}
	
	public String deleteTeam(int id) {
		int status = teamDao.deleteTeam(id);
		if(status==0) {
			return "Team Not Found";
		}else {
			return "Team Deleted";
		}
		
	}
	public String updateTeam(int id, Team team) {
		int status = teamDao.updateTeam(id, team);
		if(status==0) {
			return "Team Not Found to update";
		}else {
			return "Team Updated";
		}
	}
}
