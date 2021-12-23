public class car extends vehicle{

    protected String name;

    public car(){
        super();
    }
    public car(String type, String name, String color, String plateNumber, int year, int month, int day, int hour, int minute){
        super();
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
