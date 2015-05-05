package com.cs586.main;

import java.util.Scanner;

import com.cs586.ip.GasPump1;
import com.cs586.ip.GasPump2;
import com.cs586.ip.GasPump3;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("Welcome to GAS-PUMP Application");
			System.out.println("------------------------------------------------");
			System.out.println("Please select GAS-PUMP of your choice");
			System.out.println("1. GP-1"+"\n"+"2. GP-2"+"\n"+"3. GP-3"+"\n"+"4. Exit");
			System.out.println("------------------------------------------------");
			int gp_choice=0;
			try{
				gp_choice = Integer.parseInt(sc.nextLine());
			}
			catch(Exception e){
				System.out.println("Invalid Integer....Enter Proper Integer!!!!");
				sc.nextLine();
			}
			switch(gp_choice){
			case 1:
				callGasPump1();
				break;
			case 2:
				callGasPump2();
				break;
			case 3:
				callGasPump3();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice.....Select Correct option for GasPump!!!!!");
				break;
			}

		}
	}
	
	private static void callGasPump1() {
		GasPump1 gp1=new GasPump1();
		System.out.println("Hello.... This is GasPump 1 !!!!"+"\n");
		boolean gp1OpChoice=true;
		while(gp1OpChoice){
			System.out.println("Following are the Operations you can do with GasPump1: "+"\n"+"Select Operation of your Choice: ");
			System.out.println("----------------------------------------------------------------------------------------------------------------");
			System.out.println("1. Activate"+"\n"+"2. Start"+"\n"+"3.PayCredit"+"\n"+"4. Reject"+"\n"+"5.Cancel"+"\n"+"6.Approved"+"\n"+"7.PayCash"+"\n"+"8.StartPump"+"\n"+"9.PumpGallon"+"\n"+"10.StopPump"+"\n"+"11.Exit GasPump_1");
			System.out.println("----------------------------------------------------------------------------------------------------------------");
			Scanner sc_gp1 = new Scanner(System.in);
			int choice_gp1 = Integer.parseInt(sc_gp1.nextLine());
			switch (choice_gp1) {
			case 1:
				System.out.println("Enter value for (a) i.e Gas price per gallon to activate GasPump1: ");
				int a=0;
				try{
					a=sc_gp1.nextInt();
				}
				catch(Exception e){
					System.out.println("Invalid input Enter Correct Integer Value");
					sc_gp1.nextLine();
				}
				gp1.activate(a);
				break;
			case 2:
				gp1.start();
				break;
			case 3:
				gp1.payCredit();
				break;
			case 4:
				gp1.reject();
				break;
			case 5:
				gp1.cancel();
				break;
			case 6:
				gp1.approved();
				break;
			case 7:
				System.out.println("Enter Integer Cash in GasPump1: ");
				int cash=0;
				try{
					cash=sc_gp1.nextInt();
				}
				catch(Exception e){
					System.out.println("Invalid Input.....Enter Correct Integer Value");
					sc_gp1.nextLine();
				}
				gp1.payCash(cash);
				break;
			case 8:
				gp1.startPump();
				break;
			case 9:
				gp1.pump();
				break;
			case 10:
				gp1.stopPump();
				break;
			case 11:
				gp1OpChoice=false;
				break;
			default:
				System.out.println("Invaid Choice......Enter Correct Choice!!!!! ");
			}
		} 
	}

	private static void callGasPump2() {
		GasPump2 gp2=new GasPump2();
		System.out.println("Hello.... This is GasPump 2!!!!"+"\n");
		boolean gp2OpChoice=true;
		while(gp2OpChoice){
			System.out.println("Following are the Operations you can do with GasPump2: "+"\n"+"Select Operation of your Choice: ");
			System.out.println("----------------------------------------------------------------------------------------------------------------");
			System.out.println("1. Activate"+"\n"+"2. Start"+"\n"+"3.PayCredit"+"\n"+"4. Reject"+"\n"+"5.Cancel"+"\n"+"6.Approved"+"\n"+"7.Super"+"\n"+"8.Regular"+"\n"+"9.StartPump"+"\n"+"10.PumpGallon"+"\n"+"11.StopPump"+"\n"+"12. Exit GasPump 2");
			System.out.println("----------------------------------------------------------------------------------------------------------------");
			Scanner sc_gp2 = new Scanner(System.in);
			int choice_gp2 = Integer.parseInt(sc_gp2.nextLine());
			switch (choice_gp2) {
			case 1:
				System.out.println("Enter value for (a) i.e Gas price per gallon to activate GasPump2: ");
				float a=0;
				try{
					a=sc_gp2.nextFloat();
				}
				catch(Exception e){
					System.out.println("Enter Correct Float Value");
					sc_gp2.nextLine();
				}
				System.out.println("Enter value for (b) i.e Gas price per gallon to activate GasPump2: ");
				float b=0;
				try{
					b=sc_gp2.nextFloat();
				}
				catch(Exception e){
					System.out.println("Invalid Float....Enter Proper Float!!!!");
					sc_gp2.nextLine();
				}
				gp2.activate(a,b);
				break;
			case 2:
				gp2.start();
				break;
			case 3:
				gp2.payCredit();
				break;
			case 4:
				gp2.reject();
				break;
			case 5:
				gp2.cancel();
				break;
			case 6:
				gp2.approved();
				break;
			case 7:
				gp2.superGas();
				break;
			case 8:
				gp2.regularGas();
				break;
			case 9:
				gp2.startPump();
				break;
			case 10:
				gp2.pumpGallon();;
				break;
			case 11:
				gp2.stopPump();
				break;
			case 12:
				gp2OpChoice=false;
				break;
			default:
				System.out.println("Invaid Choice......Enter Correct Choice!!!!! ");
			}
		}
	}


	private static void callGasPump3() {
		GasPump3 gp3=new GasPump3();
		System.out.println("Hello.... This is GasPump 3!!!!"+"\n");
		boolean gp3OpChoice=true;
		while(gp3OpChoice){
			System.out.println("Following are the Operations you can do with GasPump3: "+"\n"+"Select Operation of your Choice: ");
			System.out.println("----------------------------------------------------------------------------------------------------------------");
			System.out.println("1. Activate"+"\n"+"2. Start"+"\n"+"3.PayCash"+"\n"+"4. Cancel"+"\n"+"5.Premium"+"\n"+"6.Regular"+
			"\n"+"7.StartPump"+"\n"+"8.PumpLiter"+"\n"+"9.StopPump"+"\n"+"10.Receipt"+"\n"+"11.NoReciept"+"\n"+"12. Exit GasPump 3");
			System.out.println("----------------------------------------------------------------------------------------------------------------");
			Scanner sc_gp3 = new Scanner(System.in);
			int choice_gp3 = Integer.parseInt(sc_gp3.nextLine());
			switch (choice_gp3) {
			case 1:
				System.out.println("Enter value for (a) i.e Gas price per liter to activate GasPump3: ");
				float a=0;
				try{
					a=sc_gp3.nextFloat();
				}
				catch(Exception e){
					System.out.println("Enter Correct Float Value");
					sc_gp3.nextLine();
				}
				System.out.println("Enter value for (b) i.e Gas price per liter to activate GasPump3: ");
				float b=0;
				try{
					b=sc_gp3.nextFloat();
				}
				catch(Exception e){
					System.out.println("Invalid Float....Enter Proper Float!!!!");
					sc_gp3.nextLine();
				}
				gp3.activate(a,b);
				break;
			case 2:
				gp3.start();
				break;
			case 3:
				System.out.println("Enter Float Cash in GasPump3: ");
				float cash=0;
				try{
					cash=sc_gp3.nextFloat();
				}
				catch(Exception e){
					System.out.println("Invalid Float....Enter Proper Float!!!!");
					sc_gp3.nextLine();
				}
				gp3.payCash(cash);
				break;
			case 4:
				gp3.cancel();
				break;
			case 5:
				gp3.premiumGas();
				break;
			case 6:
				gp3.regularGas();
				break;
			case 7:
				gp3.startPump();
				break;
			case 8:
				gp3.pumpLiter();
				break;
			case 9:
				gp3.stopPump();
				break;
			case 10:
				gp3.receipt();
				break;
			case 11:
				gp3.noReciept();
				gp3OpChoice=false;
				break;
			case 12:
				gp3OpChoice=false;
				break;
			default:
				System.out.println("Invaid Choice......Enter Correct Choice!!!!! ");
			}
		}

	}
	
}

