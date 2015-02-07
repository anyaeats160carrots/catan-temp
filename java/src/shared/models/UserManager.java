/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shared.models;

import java.util.List;

import shared.models.DTO.TurnTrackerDTO;

/**
 * UserManager stores the meta information regarding the users. This includes
 * the updated Turn Tracker and the current list of Users.
 *
 * @author Peter Anderson <anderson.peter@byu.edu>
 */
public class UserManager {

    private List<User> users;
    TurnTracker turnTracker;

    public List<User> getUsers() {
		return users;
	}

	public void setUsers(List users) {
		this.users = users;
	}

	public TurnTracker getTurnTracker() {
		return turnTracker;
	}

	public void setTurnTracker(TurnTracker turnTracker) {
		this.turnTracker = turnTracker;
	}

	public UserManager(List userList, TurnTracker turnTracker2) {
        this.users = userList;
        this.turnTracker = turnTracker2;
    }
}
