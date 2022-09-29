package netflixproject1;

import java.util.ArrayList;
import java.util.Random;

public class Collection {

	private ArrayList<ShowInWeek> allShowsInWeeks;
	private String collectionName;
	Random rand = new Random();
	
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
		
		for (ShowInWeek s : allShowsInWeeks) {
			if (s.getShowTitle().equals(purgedShowTitle)) {
				s.setShowTitle(st);
			}
		}
	}
	
	//Randomly suggest a show to watch:
	public String randomShow () {
		String rs = allShowsInWeeks.get(rand.nextInt(allShowsInWeeks.size())).getShowTitle();
		if (rs.charAt(0) != '*')
			return rs;
		else
			return randomShow();
	}
	
	//Suggest a show based on another show:
	public String predictShow(ShowInWeek s) {
		for (ShowInWeek x : allShowsInWeeks) {
			if (x.getCategory() == s.getCategory() && x != s 
					&& x.getShowTitle().charAt(0) != '*') {
				return x.getShowTitle();
			}
		}
		return predictShow(s);
	}
	
	//Suggest a show based on a collection of shows:
		public String predictShow(Collection c) {
			return c.randomShow();
		}
}