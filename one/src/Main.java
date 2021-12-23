import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int count = 0;
        CarParkManager c = new IITCarParkManager();
        System.out.println("----Welcome to IIT----");
        System.out.println("Enter the relevant number to choose one of the following options");

        while (count < 3) {
            System.out.println("1 - Add a vehicle\n2 - Exit a vehicle\n3 - Print the list of parked vehicles\n4 - Statistics");
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();
            switch (choice) {
                case 1 -> c.addVehicle();
                case 2 -> c.deleteVehicle();
                case 3 -> c.printList();
                case 4 -> c.statistics();

            }
            count = count + 1;
        }
        c.statistics();


    }
}
