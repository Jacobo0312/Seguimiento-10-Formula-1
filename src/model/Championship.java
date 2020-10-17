package model;
public class Championship{

//Constant
private final int MAX_PILOTS=15;

//Attributes
private int Year;
private int Races;

//Relations 
private Pilot[] pilots;

//Getters an Setters 

public int getYear(){
	return Year;
}

public void setYear(int pYear){
	Year=pYear;
}

public int getRaces(){
	return Races;
}

public void setRaces(int pRaces){
	Races=pRaces;
}


//Methods
public Championship (int Year, int Races){
this.Year=Year;
this.Races=Races;
pilots = new Pilot[MAX_PILOTS];
}

public Pilot findPilot (String name){
 Pilot objSearch=null;
 boolean findPit=false;
 for (int i=0;i<MAX_PILOTS && !findPit;i++){
 	if (pilots[i].getName().equalsIgnoreCase(name)){
 		objSearch=pilots[i];
 		findPit=true;
 	}

 }
 return objSearch;


} 

public String addPilot (String Fullname, int Age,String Team, double [] Scores)
 {
	String message="";
	boolean addPit=false;
	Pilot objSearch=findPilot(Fullname);
	
	if (objSearch!=null)
	message="Error. the pilot already exist ";
	
	else {
	
	for (int i=0;i<MAX_PILOTS && !addPit;i++)
	 {
	 
	 if (pilots[i]==null){
	 	 pilots[i]= new Pilot(Fullname,Age,Team,Scores);
	 	 addPit=true;
	 	 message="The pilot has been registered";
	 	  }
	 }
	 
	 if (addPit==true)
	 message="I already record all the times";  
	    }
	 	return message;

 }

 public void CalculateAverage(double [] Scores){
 	
 }


}


