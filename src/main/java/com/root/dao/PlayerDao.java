package com.root.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.root.model.Player;
import com.root.model.Team;


@Repository
public class PlayerDao {
List<Player> players=new ArrayList<Player>();
	
	public PlayerDao() {
		players.add(new Player(1, "Parimal", 23, "MI"));
		players.add(new Player(2, "Ram", 32, "RCB"));
		
	}
	
	public String addPlayer(Player player) {
		players.add(player);
		
		return "added Successfully";
	}
	
	public List<Player> getAllPlayers(){
		return players;
	}
	
	public Player getPlayerById(int id) {
		for (Player player : players) {
			if(player.getPlayerId()==id) {
				return player;
			}
		}
		return null;
	}
	
	public int deletePlayer(int id) {
		
		for (Player player : players) {
			
		if(player.getPlayerId()==id){
			players.remove(player);
			return 1;
		}
	  }
		
		return 0;
	}
	
	public int updatePlayer(int id,Player player) {
		
		int status = deletePlayer(id);
		if(status == 1) {
			players.add(player);
			return 1;
			
		}else {
			return 0;
		}
		
		
	}
}
