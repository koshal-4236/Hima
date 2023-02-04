package oops;
import java.util.*;
public class Movies {
// Declare Properties here
	String movie_name,actor,actress,director,producer;
	int budget;
	float rating;
	Scanner sc=new Scanner(System.in);
	public void getMovieDetails()
	{
		movie_name=sc.nextLine();
		actor=sc.nextLine();
		actress=sc.nextLine();
		director=sc.nextLine();
		producer=sc.nextLine();
		budget=sc.nextInt();
		rating=sc.nextFloat();
	}
	public void showMovieDetails()
	{
		System.out.println("Movie Name: "+movie_name);
		System.out.println("Actor: "+actor);
		System.out.println("Actress: "+actress);
		System.out.println("Director: "+director);
		System.out.println("Producer: "+producer);
		System.out.println("Budget: "+budget);
		System.out.println("Rating: "+rating);
	}
	public String getActor()
	{
		return actor;
	}
	public int getBudget()
	{
		return budget;
	}
	public float getRating()
	{
		return rating;
	}
	public String toString()
	{
		return actor+" "+actress+" "+movie_name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Movies m1=new Movies();
        m1.getMovieDetails();
        m1.showMovieDetails();
        System.out.println(m1);
	}

}