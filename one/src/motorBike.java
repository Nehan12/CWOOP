public class motorBike extends vehicle{
    protected String name;


    public motorBike(){
        super();
    }
    public motorBike(String type, String name, String color, String plateNumber, int year, int month, int day, int hour, int minute ){
        this.entryYear = year;
        this.entryMonth = month;
        this.entryDay = day;
        this.entryHour = hour;
        this.entryMinute = minute;
        this.name = name;
        this.type = type;
        this.color = color;
        this.plateNumber = plateNumber;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }
}
