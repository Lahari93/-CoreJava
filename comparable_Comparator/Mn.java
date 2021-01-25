package comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;


/*//Java provides two interfaces to sort objects using data members of the class: 

1.	Comparable
2.	Comparator*/

public class Mn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
 
        Collections.sort(list);
 
        System.out.println("Movies after sorting : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
        }
        
        
        NameComapre nameCompare = new NameComapre();
       
        Collections.sort(list, nameCompare);
        for (Movie movie: list)
            System.out.println(movie.getRating() + " " +
                               movie.getName() + " " +
                               movie.getYear());

	}

}
