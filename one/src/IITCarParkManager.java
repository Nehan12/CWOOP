import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class IITCarParkManager implements CarParkManager {

    private final int max = 60;

    private List<vehicle> groundVehicleList = new ArrayList<>();
    private List<vehicle> firstVehicleList = new ArrayList<>();
    private List<vehicle> secondVehicleList = new ArrayList<>();
    private List<vehicle> thirdVehicleList = new ArrayList<>();
    private List<vehicle> fourthVehicleList = new ArrayList<>();
    private List<vehicle> fifthVehicleList = new ArrayList<>();
    private List<vehicle> vehicles = new ArrayList<>();
    private List<vehicle> carList = new ArrayList<>();
    private List<vehicle> vanList = new ArrayList<>();
    private List<vehicle> bikeList = new ArrayList<>();
    private List<vehicle> lorryList = new ArrayList<>();
    private List<vehicle> busList = new ArrayList<>();
    double RemGroundSlots = 60;
    double RemFirstSlots = 60;
    double RemSecondSlots = 60;
    double RemThirdSlots = 60;
    double RemFourthSlots = 60;
    double RemFifthSlots = 60;







    public IITCarParkManager() {
    }

    public void printList(){
        System.out.println("Enter a valid integer: ");
        System.out.println("1 - All vehicles\n2 - Cars\n3 - Vans\n4 - Motor Bikes\n5 - Buses\n6 - Lorries");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        switch (choice){
            case 1 :
                System.out.println(vehicles);
                break;
            case 2:
                System.out.println(carList);
                break;
            case 3:
                System.out.println(vanList);
                break;
            case 4:
                System.out.println(bikeList);
                break;
            case 5:
                System.out.println(busList);
                break;
            case 6:
                System.out.println(lorryList);
                break;
        }

    }

//    @Override
    public boolean addCar(String type, String name, String color, String plateNumber, String dateTime) {
        String[] dateTimeArray = dateTime.split("/");
        int year = parseInt(dateTimeArray[0]);
        int month = parseInt(dateTimeArray[1]);
        int date = parseInt(dateTimeArray[2]);
        int hour = parseInt(dateTimeArray[3]);
        int minute = parseInt(dateTimeArray[4]);

        vehicle car = new car(type, name, color, plateNumber, year, month, date, hour, minute);
        vehicles.add(car);
        carList.add(car);

            if (RemThirdSlots > 0) {
                thirdVehicleList.add(car);
                RemThirdSlots = RemThirdSlots -1;
                System.out.println("Parked on the third floor");
                System.out.println("Remaining slots on the third floor: " + RemThirdSlots);
                return true;
            } else if (RemThirdSlots == 0 && RemFourthSlots > 0) {
                fourthVehicleList.add(car);
                RemFourthSlots = RemFourthSlots - 1;
                System.out.println("Parked on the fourth floor");
                System.out.println("Remaining slots on the fourth floor: " + RemFourthSlots);
                return true;
            } else if (RemFourthSlots == 0 && RemFifthSlots > 0) {
                fifthVehicleList.add(car);
                RemFifthSlots = RemFifthSlots - 1;
                System.out.println("Parked on the fifth floor");
                System.out.println("Remaining slots on the fifth floor: " + RemFifthSlots);
                return true;
            } else if (RemFifthSlots == 0 && RemGroundSlots > 0) {
                groundVehicleList.add(car);
                RemGroundSlots = RemGroundSlots - 1;
                System.out.println("Parked on the ground floor");
                System.out.println("Remaining slots on the ground floor: " + RemGroundSlots);
                return true;
            } else if (RemGroundSlots == 0 && RemFirstSlots > 0) {
                firstVehicleList.add(car);
                RemFirstSlots = RemFirstSlots - 1;
                System.out.println("Parked on the first floor");
                System.out.println("Remaining slots on the first floor: " + RemFirstSlots);
                return true;
            } else if (RemFirstSlots == 0 && RemSecondSlots > 0) {
                secondVehicleList.add(car);
                RemSecondSlots = RemSecondSlots - 1;
                System.out.println("Parked on the second floor");
                System.out.println("Remaining slots on the second floor: " + RemSecondSlots);
                return true;
            }else {
                System.out.println("no space");
                return false;
            }


    }


//    @Override
    public boolean addVan(String type, String name, String color, String plateNumber, String dateTime) {
        String[] dateTimeArray = dateTime.split("/");
        int year = parseInt(dateTimeArray[0]);
        int month = parseInt(dateTimeArray[1]);
        int date = parseInt(dateTimeArray[2]);
        int hour = parseInt(dateTimeArray[3]);
        int minute = parseInt(dateTimeArray[4]);

        vehicle van = new van(type, name, color, plateNumber, year, month, date, hour, minute);
        vehicles.add(van);
        vanList.add(van);
            if (RemFirstSlots > 0) {
                firstVehicleList.add(van);
                RemFirstSlots = RemFirstSlots - 2;
                System.out.println("Parked on the first floor");
                System.out.println("Remaining slots on the first floor: " + RemFirstSlots);
                return true;
            } else if (RemFirstSlots == 0 && RemSecondSlots > 0) {
                secondVehicleList.add(van);
                RemSecondSlots = RemSecondSlots - 2;
                System.out.println("Parked on the second floor");
                System.out.println("Remaining slots on the second floor: " + RemSecondSlots);
                return true;
            } else if (RemSecondSlots == 0 && RemGroundSlots > 0) {
                groundVehicleList.add(van);
                RemGroundSlots = RemGroundSlots - 2;
                System.out.println("Parked on the ground floor");
                System.out.println("Remaining slots on the ground floor: " + RemGroundSlots);
                return true;
            }else{
                System.out.println("no space");
                return false;
            }


    }

//    @Override
    public boolean addBike(String type, String name, String color, String plateNumber, String dateTime) {
        String[] dateTimeArray = dateTime.split("/");
        int year = parseInt(dateTimeArray[0]);
        int month = parseInt(dateTimeArray[1]);
        int date = parseInt(dateTimeArray[2]);
        int hour = parseInt(dateTimeArray[3]);
        int minute = parseInt(dateTimeArray[4]);

        vehicle bike = new motorBike(type, name, color, plateNumber, year, month, date, hour, minute);
        bikeList.add(bike);
        vehicles.add(bike);
        if  (RemFirstSlots > 0){
            firstVehicleList.add(bike);
            RemFirstSlots = RemFirstSlots - (1/3);
            System.out.println("Parked on the first floor");
            System.out.println("Remaining slots on the first floor: " + RemFirstSlots);
            return true;
        }
        else if  (RemFirstSlots == 0 && RemSecondSlots > 0){
            secondVehicleList.add(bike);
            RemSecondSlots = RemSecondSlots - (1/3);
            System.out.println("Parked on the second floor");
            System.out.println("Remaining slots on the second floor: " + RemSecondSlots);
            return true;
        }
        else if (RemSecondSlots == 0 && RemGroundSlots > 0){
            groundVehicleList.add(bike);
            RemGroundSlots = RemGroundSlots - (1/3);
            System.out.println("Parked on the ground floor");
            System.out.println("Remaining slots on the ground floor: " + RemGroundSlots);
            return true;
        }else {
            System.out.println("no space");
            return false;
        }

    }

//    @Override
    public boolean addBus(String type, String name, String color, String plateNumber, String dateTime) {
        String[] dateTimeArray = dateTime.split("/");
        int year = parseInt(dateTimeArray[0]);
        int month = parseInt(dateTimeArray[1]);
        int date = parseInt(dateTimeArray[2]);
        int hour = parseInt(dateTimeArray[3]);
        int minute = parseInt(dateTimeArray[4]);
        vehicle bus = new miniBus(type, name, color, plateNumber, year, month, date, hour, minute);
        busList.add(bus);
        vehicles.add(bus);
        if (RemGroundSlots > 0){
            groundVehicleList.add(bus);
            RemGroundSlots = RemGroundSlots - 3;
            System.out.println("Parked on the ground floor");
            System.out.println("Remaining slots on the ground floor: " + RemGroundSlots);
            return true;
        }else {
            System.out.println("no space");
            return false;
        }


    }

//    @Override
    public boolean addLorry(String type, String name, String color, String plateNumber, String dateTime) {
        String[] dateTimeArray = dateTime.split("/");
        int year = parseInt(dateTimeArray[0]);
        int month = parseInt(dateTimeArray[1]);
        int date = parseInt(dateTimeArray[2]);
        int hour = parseInt(dateTimeArray[3]);
        int minute = parseInt(dateTimeArray[4]);
        vehicle lorry = new miniLorry(type, name, color, plateNumber, year, month, date, hour, minute);
        lorryList.add(lorry);
        vehicles.add(lorry);
        if (RemGroundSlots > 0){
            groundVehicleList.add(lorry);
            RemGroundSlots = RemGroundSlots - 3;
            System.out.println("Parked on the ground floor");
            System.out.println("Remaining slots on the ground floor: " + RemGroundSlots);
            return true;
        }else{
            System.out.println("no space");
            return false;
        }
    }
    public void printPercentages(){
        int total = carList.size() + bikeList.size() + vanList.size() + lorryList.size() + busList.size();
        try {
            double carPercentage = (carList.size()*100 )/ total;
            double bikePercentage = (bikeList.size()*100 )/ total;
            double vanPercentage = (vanList.size()*100 )/ total;
            double busPercentage = (busList.size()*100 )/ total;
            double lorryPercentage = (lorryList.size()*100 )/ total;
            System.out.println("Enter a valid integer from the options given below");
            System.out.println("1 - Cars\n2 - Vans\n3 - Bikes\n4 - Busses\n5 - Lorries");
            Scanner k = new Scanner(System.in);
            int choice = k.nextInt();
            switch (choice) {
                case 1 -> System.out.println(carPercentage);
                case 2 -> System.out.println(vanPercentage);
                case 3 -> System.out.println(bikePercentage);
                case 4 -> System.out.println(busPercentage);
                case 5 -> System.out.println(lorryPercentage);
                default -> System.out.println("Enter a valid Integer");
            }
        }
        catch (ArithmeticException e) {
            System.out.println("no vehicles in the park");
        }

    }



    public void vehiclesOnADay(){
        System.out.println("Enter the date: (year/month/date)");
        Scanner s = new Scanner(System.in);
        String date = s.nextLine();
        String[] arr = date.split("/");
        System.out.println();
        List<vehicle> v = new ArrayList<>();
        for (vehicle vehicle : vehicles) {
            if (vehicle.exitYear == parseInt(arr[0])) {
                if (vehicle.exitMonth == parseInt(arr[1])) {
                    if (vehicle.exitDay == parseInt(arr[3])) {
                        System.out.println(vehicle);
                        v.add(vehicle);
                    }
                }
            }
        }
        System.out.println(v);

    }
    public void statistics(){
        System.out.println("Enter a valid integer: ");
        System.out.println("1 - Percentages\n2 - Vehicles by Date\n3 - What vehicle was parked the longest time? ");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        switch (choice) {
            case 1 -> printPercentages();
            case 2 -> vehiclesOnADay();
            case 3 -> longestTime();
            default -> System.out.println("Enter a valid Integer");
        }
    }


    public void longestTime(){
        int maxTime = 0;
        vehicle v = null;
        for (vehicle vehicle : vehicles) {
            int time1 = vehicle.time;
            if (time1 >= maxTime) {
                maxTime = time1;
                v = vehicle;
            }
        }
        System.out.println(v);

    }

    @Override
    public void deleteVehicle() {

        System.out.println("plate number? ");
        Scanner s = new Scanner(System.in);
        String plateNumber = s.nextLine();
        System.out.println("Enter the exited date and time (year/month/date/hour/minute)");
        Scanner y = new Scanner(System.in);
        String dateTime = y.nextLine();
        String[] dateTimeArray = dateTime.split("/");
        int year = parseInt(dateTimeArray[0]);
        int month = parseInt(dateTimeArray[1]);
        int date = parseInt(dateTimeArray[2]);
        int hour = parseInt(dateTimeArray[3]);
        int minute = parseInt(dateTimeArray[4]);


        vehicles.removeIf(obj -> obj.equals(plateNumber));
        firstVehicleList.removeIf(obj1 -> obj1.getPlateNumber().equals(plateNumber));
        secondVehicleList.removeIf(obj1 -> obj1.getPlateNumber().equals(plateNumber));
        thirdVehicleList.removeIf(obj1 -> obj1.getPlateNumber().equals(plateNumber));
        fourthVehicleList.removeIf(obj1 -> obj1.getPlateNumber().equals(plateNumber));
        fifthVehicleList.removeIf(obj1 -> obj1.getPlateNumber().equals(plateNumber));




        for (vehicle obj : carList){
            if (obj.getPlateNumber().equals(plateNumber)){
                obj.exitYear = year;
                obj.exitMonth = month;
                obj.exitDay = date;
                obj.exitHour = hour;
                obj.exitMinute = minute;
//                carList.remove(obj);
                System.out.println(obj + " exited on "+  year+"/"+month+"/"+date+" at "+hour+":"+minute);
            }
        }
        carList.removeIf(obj1 -> obj1.getPlateNumber().equals(plateNumber));
        for (vehicle obj : vanList){
            if (obj.getPlateNumber().equals(plateNumber)){
                obj.exitYear = year;
                obj.exitMonth = month;
                obj.exitDay = date;
                obj.entryHour = hour;
                obj.exitMinute = minute;
//                vanList.remove(obj);
                System.out.println(obj);
            }
        }
        vanList.removeIf(obj1 -> obj1.getPlateNumber().equals(plateNumber));
        for (vehicle obj : bikeList){
            if (obj.getPlateNumber().equals(plateNumber)){
                obj.exitYear = year;
                obj.exitMonth = month;
                obj.exitDay = date;
                obj.entryHour = hour;
                obj.exitMinute = minute;
//                bikeList.remove(obj);
                System.out.println(obj);
            }
        }
        bikeList.removeIf(obj1 -> obj1.getPlateNumber().equals(plateNumber));

        for (vehicle obj : busList){
            if (obj.getPlateNumber().equals(plateNumber)){
                obj.exitYear = year;
                obj.exitMonth = month;
                obj.exitDay = date;
                obj.entryHour = hour;
                obj.exitMinute = minute;
//                busList.remove(obj);
                System.out.println(obj);
            }
        }
        busList.removeIf(obj1 -> obj1.getPlateNumber().equals(plateNumber));

        for (vehicle obj : lorryList){
            if (obj.getPlateNumber().equals(plateNumber)){
                obj.exitYear = year;
                obj.exitMonth = month;
                obj.exitDay = date;
                obj.entryHour = hour;
                obj.exitMinute = minute;
//                lorryList.remove(obj);
                System.out.println(obj);
            }
        }
        lorryList.removeIf(obj1 -> obj1.getPlateNumber().equals(plateNumber));







    }



    @Override
    public void addVehicle() {
        System.out.println("Please Enter your the License Plate number of your vehicle ");
        Scanner v = new Scanner(System.in);
        String plateNumber = v.nextLine();
        System.out.println("1-car, 2-van, 3-bike, 4-bus, 5-lorry");
        Scanner s = new Scanner(System.in);
//        vehicles.add(plateNumber);
        int vehicleType = s.nextInt();
        System.out.println("Color? ");
        Scanner n = new Scanner(System.in);
        String color = n.nextLine();
        System.out.println("name? ");
        Scanner k = new Scanner(System.in);
        String name = k.nextLine();
        System.out.println("datetime? (year/month/date/hour/minute)");
        Scanner l = new Scanner(System.in);
        String dateTime = l.nextLine();



        switch (vehicleType){
            case 1:
                String type = "car";
                addCar(type, name, color, plateNumber, dateTime);
                break;
            case 2:
                type = "van";
                addVan(type, name, color, plateNumber, dateTime);
                break;
            case 3:
                type = "bike";
                addBike(type, name, color, plateNumber, dateTime);
                break;
            case 4:
                type = "mini bus";
                addBus(type, name, color, plateNumber, dateTime);
                break;
            case 5:
                type = "lorry";
                addLorry(type, name, color, plateNumber, dateTime);
                break;
        }
    }



}
