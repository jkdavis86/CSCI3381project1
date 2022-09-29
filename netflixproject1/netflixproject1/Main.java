package netflixproject1;

/*
 * Jake Davis
 * CSCI 3381
 * Project 1: Netflix Data Back End
 */

import netflixproject1.ShowInWeek;
import netflixproject1.Collection;

public class Main {

	public static void main(String[] args) {

		Collection csci3381 = new Collection("Test Collection");
		
		ShowInWeek aShow = new ShowInWeek("2022-09-04","Films (English)", "1", "Me Time", "N/A", "56560000", "2");
		System.out.println("printing a single show");
		System.out.println(aShow);
		System.out.println();
		
		

		csci3381.addShowInWeek(aShow);
		
		csci3381.addShowInWeek(new ShowInWeek("2022-09-04","Films (English)", "2", "Love in the Villa", "N/A", "41220000", "1"));
		csci3381.addShowInWeek(new ShowInWeek("2022-08-28","Films (English)", "10", "The Great Wall", "N/A", "10090000", "1"));
		csci3381.addShowInWeek(new ShowInWeek("2022-09-04","Films (English)", "2", "Love in the Villa", "N/A", "41220000", "1"));
		

		System.out.println("printing entire collection");
		System.out.println(csci3381);
		System.out.println();
		
		System.out.println("printing week 2022-09-04:");
		System.out.println(csci3381.getWeek("2022-09-04"));
		System.out.println();
		
		csci3381.purgeShow("Love in the Villa");
		System.out.println("printing purged:");
		System.out.println(csci3381);
		System.out.println();
		
		csci3381.unpurgeShow("Love in the Villa");
		System.out.println("printing unpurged:");
		System.out.println(csci3381);
		System.out.println();
		

		System.out.println("printing random show:");
		System.out.println(csci3381.randomShow());
		System.out.println();

	}
}
