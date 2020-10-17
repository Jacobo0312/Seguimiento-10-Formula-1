package model;
 public class Pilot {


 //Attributes
private String Fullname;
private int Age;
public int [] Scores;
private String Team;

//Methods
public Pilot (String pFullname, int pAge,String pTeam, int [] pScore){
Fullname=pFullname; 
Age=pAge;
Team=pTeam;

 }



public String getName(){
	return Fullname;
}


//Getters an Setters



}