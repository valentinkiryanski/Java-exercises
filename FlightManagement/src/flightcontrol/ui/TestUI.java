package flightcontrol.ui;
import flightcontrol.logic.AirportAsset;

import java.util.*;
import flightcontrol.domain.Airplane;
import flightcontrol.logic.FlightControl;



public class TestUI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AirportAsset aa = new AirportAsset();
        FlightControl fc = new FlightControl(aa);

        TestUI ui = new TestUI();
        ui.start(scanner,aa,fc);
    }


    public void start(Scanner scanner, AirportAsset aa,FlightControl fc){
        while(true){
           System.out.print("Choose an action:\n" +
                   "[1] Add an airplane\n" +
                   "[2] Add a flight\n" +
                   "[x] Exit Airport Asset Control\n" +
                   "> ");
           String option = scanner.nextLine();
           if(option.equals("x")){
               break;
           } else if(Integer.valueOf(option) == 1){
                System.out.print("Give the airplane id:");
                String id = scanner.nextLine();;
                System.out.print("Give the airplane capacity:");
                String capacity = scanner.nextLine();
                aa.addAirplane(new Airplane(id,Integer.valueOf(capacity)));
           }else if(Integer.valueOf(option) == 2){
                System.out.print("Give the airplane id");
                String id = scanner.nextLine();
                System.out.print("Give the departure airport id:");
                String depID = scanner.nextLine();
                System.out.print("Give the target airport id:");
                String targID = scanner.nextLine();
                aa.addFlight(id,depID,targID);
           }

        }

        while(true){
            System.out.print("Choose an action:\n" +
                    "[1] Print airplanes\n" +
                    "[2] Print flights\n" +
                    "[3] Print airplane details\n" +
                    "[x] Quit\n" +
                    ">");
            String option = scanner.nextLine();
            if(option.equals("x")){
                break;
            }else if(Integer.valueOf(option) == 1){
                fc.printAirplanes();
            }else if(Integer.valueOf(option) == 2){
                fc.printFlights();
            }else if(Integer.valueOf(option) == 3){
                System.out.print("Give the airplane id: ");
                String name = scanner.nextLine();
                fc.printAirplaneDetails(name);
            }
        }


    }
}
