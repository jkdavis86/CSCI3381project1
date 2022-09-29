package netflixproject1;

import java.util.ArrayList;

public class Collection {

	private ArrayList<ShowInWeek> allShowsInWeeks;
	private String collectionName;
	
	//Default Constructor:
	public Collection () {
		collectionName = "";
		allShowsInWeeks = new ArrayList<ShowInWeek>();
	}
	
	//Constructor:
	public Collection (String cn) {
		collectionName = cn;
		allShowsInWeeks = new ArrayList<ShowInWeek>();
	}

	//Displays all of collection as a string:
	public String toString () {
		String toReturn = collectionName + ":\n";
		for (ShowInWeek s : allShowsInWeeks) {
			toReturn += s.toString() + "\n";
		}
		return toReturn;
	}	
	
	//Returns a string of shows in a specific week:
	public String getWeek (String week) {
		
		String toReturn = "";
		
		for (ShowInWeek s : allShowsInWeeks) {
			if (s.getWeek() == week) {
				toReturn += s.toString() + "\n";
			}
		}
		return toReturn;
	}
	
	//Adds show in week to collection:
	public void addShowInWeek (ShowInWeek s) {
		allShowsInWeeks.add(s);
	}
	
	//Makes a show unavailable when suggestions are made:
	public void purgeShow (String showTitle) {
		
		for (ShowInWeek s : allShowsInWeeks) {
			if (s.getShowTitle().equals(showTitle)) {
				s.setShowTitle("*" + s.getShowTitle());
			}
		}
	}
	
	//Makes a purged show available again:
	public void unpurgeShow (String st) {
		
		String purgedShowTitle = "*" + st;
		System.out.println("PST = " + purgedShowTitle);
		
		for (ShowInWeek s : allShowsInWeeks) {
			if (s.getShowTitle().equals(purgedShowTitle)) {
				System.out.println("About to unpurge " + st);
				s.setShowTitle(st);
			}
		}
	}
}