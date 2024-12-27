package com.root.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.root.model.Match;
import com.root.model.Team;


@Repository
public class MatchDao {
List<Match> matchs=new ArrayList<Match>();
	
	public MatchDao() {
		matchs.add(new Match(1, "CSK", "CSK One", "2024-06-03", "Rajiv Gandhi Stadium", "CSK won"));
		matchs.add(new Match(2, "RCB", "RCB One", "2023-11-12", "Ahmadabad Stadium", "RCB won"));
		
	}
	
	public String addMatch(Match match) {
		matchs.add(match);
		
		return "added Successfully";
	}
	
	public List<Match> getAllMatches(){
		return matchs;
	}
	
	public Match getMatchById(int id) {
		for (Match match : matchs) {
			if(match.getMatchId()==id) {
				return match;
			}
		}
		return null;
	}
	
	public int deleteMatch(int id) {
		
		for (Match match : matchs) {
			
		if(match.getMatchId()==id){
			matchs.remove(match);
			return 1;
		}
	  }
		
		return 0;
	}
	
	public int updateMatch(int id,Match match) {
		
		int status = deleteMatch(id);
		if(status == 1) {
			matchs.add(match);
			return 1;
			
		}else {
			return 0;
		}
		
		
	}
}
