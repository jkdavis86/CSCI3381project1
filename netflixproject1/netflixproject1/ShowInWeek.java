package netflixproject1;

public class ShowInWeek {
	private String week;
	private String category;
	private String weeklyRank;
	private String showTitle;
	private String seasonTitle;
	private String weeklyHoursViewed;
	private String top10Weeks;
	
	//Default Constructor:
	public ShowInWeek () {
		week = "";
		category = "";
		weeklyRank = "";
		showTitle = "";
		seasonTitle = "";
		weeklyHoursViewed = "";
		top10Weeks = "";
	}
	
	//Constructor:
	public ShowInWeek (String w, String c, String wr, String sht, String set, String whv, String t10) {
		week = w;
		category = c;
		weeklyRank = wr;
		showTitle = sht;
		seasonTitle = set;
		weeklyHoursViewed = whv;
		top10Weeks = t10;
	}

	//Returns true if week and show and season title are the same:
	public boolean equals (ShowInWeek rhs) {
		if (rhs.week.equals(week) 
				&& rhs.showTitle.equals(showTitle)
				&& rhs.seasonTitle.equals(seasonTitle))
			return true;
		return false;
	}
	
	//Returns string of show in week:
	public String toString () {
		String toReturn = week + "\n";
		toReturn += category + "\n";
		toReturn += weeklyRank + "\n";
		toReturn += showTitle + "\n";
		toReturn += seasonTitle + "\n";
		toReturn += weeklyHoursViewed + "\n";
		toReturn += top10Weeks;
		return toReturn;
	}
	
	//Getters and setters begin here:
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getWeeklyRank() {
		return weeklyRank;
	}
	public void setWeeklyRank(String weeklyRank) {
		this.weeklyRank = weeklyRank;
	}
	public String getShowTitle() {
		return showTitle;
	}
	public void setShowTitle(String showTitle) {
		this.showTitle = showTitle;
	}
	public String getSeasonTitle() {
		return seasonTitle;
	}
	public void setSeasonTitle(String seasonTitle) {
		this.seasonTitle = seasonTitle;
	}
	public String getWeeklyHoursViewed() {
		return weeklyHoursViewed;
	}
	public void setWeeklyHoursViewed(String weeklyHoursViewed) {
		this.weeklyHoursViewed = weeklyHoursViewed;
	}
	public String getTop10Weeks() {
		return top10Weeks;
	}
	public void setTop10Weeks(String top10Weeks) {
		this.top10Weeks = top10Weeks;
	}
	 

}
