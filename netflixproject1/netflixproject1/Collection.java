package netflixproject1;

import java.util.ArrayList;
import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Collection {

	private ArrayList<ShowInWeek> allShowsInWeeks;
	private String collectionName;
	private String fileName;
	private Random rand = new Random();
	
	//Default Constructor:
	public Collection () {
		collectionName = "collection";
		allShowsInWeeks = new ArrayList<ShowInWeek>();
		fileName = null;
	}
	
	//Constructor:
	public Collection (String cn, String fn) {
		collectionName = cn;
		allShowsInWeeks = new ArrayList<ShowInWeek>();
		fileName = null;
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
		
	//Used for saving data between program runs:
	public void writeFile () {
		doWrite(fileName);
	}
	
	//Used for testing writing functions:
	public void writeFile (String altFileName) {
		doWrite(altFileName);
	}
	
	//Writes all of the data in collection to a file
		private void doWrite(String fn) {
		/*	try
			{
				FileWriter fw = new FileWriter(fn);
				BufferedWriter myOutfile = new BufferedWriter(fw);
				
				for (int i = 0; i < allShowsInWeeks.size(); i++) {
					ShowInWeek s = allShowsInWeeks.get(i);
					myOutfile.write (s.getWeek() + "\n");
					myOutfile.write (s.getCategory() + "\n");
					myOutfile.write (s.getWeeklyRank() + "\n");
					myOutfile.write (s.getShowTitle() + "\n");
					myOutfile.write (s.getSeasonTitle() + "\n");
					myOutfile.write (s.getWeeklyHoursViewed() + "\n");
					myOutfile.write (s.getTop10Weeks() + "\n");
				}
			}
			
			catch
			{
				
			} */
			
		}
}