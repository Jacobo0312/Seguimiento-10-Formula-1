package model;
 public class Pilot {


 //Attributes
private String fullname;
private int age;
private int [] scores;
private String team;

//Methods
public Pilot (String pFullname, int pAge,String pTeam, int [] pScore){
fullname=pFullname; 
age=pAge;
team=pTeam;
scores=pScore;
 }

  public String calculateAverage(){
        int num=0,hor=0,min=0,seg=0;
        String message="";
for (int i=0;i<scores.length;i++){
        num=scores[i];
        hor=num/3600;
        min=(num-(3600*hor))/60;
        seg=num-((hor*3600)+(min*60));
    }
    message=fullname+(": "+hor+"h "+min+"m "+seg+"s\n");
    return message;
 }



public String getName(){
	return fullname;
}

public int [] getScore(){
	return scores;
}


}