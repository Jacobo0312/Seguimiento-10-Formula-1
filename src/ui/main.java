/**
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * A00368502
 * Universidad Icesi (Cali - Colombia)
 * @Author: Jacobo Garcia
 * @Date: 16 marzo 2020
 *
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
 package ui;
 import java.util.Scanner;
 import model.Championship;
 public class Main {

 	public static Championship mainChampionship;
 	public static Scanner lector;

 public Main(){
  lector=new Scanner(System.in);
  createChampionship();
 }

 public static void main (String[] args){

 	Main objMain=new Main();
 	boolean menu=true;
 	objMain.menu();

 }

 public static void createChampionship(){

  System.out.println("Enter Championship year");
  int yearChamp=lector.nextInt();
  System.out.println("Enter how many races are in the championship");
  int racesChamp=lector.nextInt();
    mainChampionship= new Championship (yearChamp, racesChamp);
  	mainChampionship.setRaces(racesChamp);
 }

 public static void createPilot(){
  
  System.out.println("Enter the pilot's name");
  String name=lector.nextLine();lector.nextLine();
  System.out.println("Enter the age of the pilot");
  int Age=lector.nextInt();lector.nextLine();
  System.out.println("Enter the team of the pilot");
  String Team=lector.nextLine();lector.nextLine();
  System.out.println("Enter time for each race in seconds");
  int[] Scores= new int [mainChampionship.getRaces()];
  for (int i=0;i<mainChampionship.getRaces();i++){
  System.out.println((i+1)+".time");

  Scores[i]=lector.nextInt();
  }
 String message=mainChampionship.addPilot(name, Age, Team,Scores);
 System.out.println(message);

 }

 public static void showAverageTimes(){
  for (int i=0;i<mainChampionship.getRaces();i++){
  mainChampionship.calculateAverage(mainChampionship.pilots.Scores);
  }

 }






 public void menu(){
 	boolean menu=true;
 	while (menu)
 	{
 		System.out.println("Enter 1 to register the pilot, enter 2 to show the average of each pilot, Enter 3 to exit");
 		int option=lector.nextInt();
 		switch(option){
 			case 1: createPilot();
 			break;
 			case 2: 
 			break; 
 			case 3:  menu=false;
 			break;       

 		}
 	}
 }



}
