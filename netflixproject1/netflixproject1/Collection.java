package netflixproject1;

import java.util.ArrayList;

public class Collection {

	private ArrayList<ShowInWeek> allShowsInWeeks;
	private String collectionName;
	
	public Collection (String cn) {
		collectionName = cn;
		allShowsInWeeks = new ArrayList<ShowInWeek>();
	}

	public String toString () {
		String toReturn = collectionName + ":\n";
		for (ShowInWeek s : allShowsInWeeks) {
			toReturn += s.toString() + "\n";
		}
		return toReturn;
	}	
	
	public String getWeek (String week) {
		
		String toReturn = "";
		
		for (ShowInWeek s : allShowsInWeeks) {
			if (s.getWeek() == week) {
				toReturn += s.toString() + "\n";
			}
		}
		return toReturn;
	}
	
	public void addShowInWeek (ShowInWeek s) {
		allShowsInWeeks.add(s);
	}
	
	public void purgeShow (String showTitle) {
		
		for (ShowInWeek s : allShowsInWeeks) {
			if (s.getShowTitle() == showTitle) {
				s.setShowTitle("*" + s.getShowTitle());
			}
		}
	}
	
public void unpurgeShow (String showTitle) {
		
		for (ShowInWeek s : allShowsInWeeks) {
			if (s.getShowTitle() == "*" + showTitle) {
				s.setShowTitle(showTitle);
			}
		}
	}
}