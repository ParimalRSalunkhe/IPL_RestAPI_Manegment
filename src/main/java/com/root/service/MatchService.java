package com.root.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.root.dao.MatchDao;
import com.root.model.Match;

@Service
public class MatchService {
	@Autowired
	private MatchDao matchDao;
	
	public String addMatch(Match match){
		
	String msg = matchDao.addMatch(match);

	return msg;
	
	}
	public List<Match> getAllMatches(){
		
	List<Match> allMatches = matchDao.getAllMatches();
	
	return allMatches;
	}
	
	public Match getMatchById(int id) {
		Match match = matchDao.getMatchById(id);
		return match;
	}
	
	public String deleteMatch(int id) {
		int status = matchDao.deleteMatch(id);
		if(status==0) {
			return "Match Not Found";
		}else {
			return "Match Deleted";
		}
		
	}
	public String updateMatch(int id, Match match) {
		int status = matchDao.updateMatch(id, match);
		if(status==0) {
			return "Match Not Found to update";
		}else {
			return "Match Updated";
		}
	}

}
