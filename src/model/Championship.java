package model;
public class Championship{

//Constant
private final int MAX_PILOTS=15;

//Attributes
private int year;
private int races;

//Relations 
private Pilot[] pilots;

//Getters an Setters 

public int getYear(){
	return year;
}

public void setYear(int pYear){
	year=pYear;
}

public int getRaces(){
	return races;
}

public void setRaces(int pRaces){
	races=pRaces;
}

public Pilot[] getPilots(){
	return pilots;
}


//Methods
public Championship (int Year, int Races){
this.year=Year;
this.races=Races;
pilots = new Pilot[MAX_PILOTS];
}

public Pilot findPilot (String name){
 Pilot objSearch=null;
 boolean findPit=false;
 for (int i=0;i<MAX_PILOTS && !findPit;i++){
 	if (pilots[i] !=null && pilots[i].getName().equalsIgnoreCase(name)){
 		objSearch=pilots[i];
 		findPit=true;
 	}
 	else
 		objSearch=pilots[i];
 }
 return objSearch;
} 

public String addPilot (String pFullname, int pAge,String pTeam, int [] pScores)
{
	String message="";
	boolean addPit=false;
	Pilot objSearch=findPilot(pFullname);
	
	if (objSearch!=null)
		message="Error. the pilot already exist ";
	
	else {
		for (int i=0;i<MAX_PILOTS && !addPit;i++)
		{

			if (pilots[i]==null){
				pilots[i]= new Pilot(pFullname,pAge,pTeam,pScores);
				addPit=true;
				message="The pilot has been registered";
			}
		}

		if (addPit==false)
			message="All pilots are already created";  
	}
	return message;

}


  public String showAverageTimes(){
  String message="";
  for (int i=0;i<pilots.length;i++){
  if (pilots[i]!=null)
  message+=pilots[i].calculateAverage();
  }
  return message;

 }

}


