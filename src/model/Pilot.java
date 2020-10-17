package model;
 public class Pilot {


 //Attributes
private String Fullname;
private int Age;
private double [] Scores;
private String Team;

//Methods
public Pilot (String pFullname, int pAge,String pTeam, double [] pScore){
Fullname=pFullname; 
Age=pAge;
Team=pTeam;

 }



public String getName(){
	return Fullname;
}


//Getters an Setters



}