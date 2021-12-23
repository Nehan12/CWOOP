public class miniLorry extends vehicle implements java.io.Serializable{
    protected String name;


    public miniLorry(){
        super();
    }
    public miniLorry(String type, String name, String color, String plateNumber, int year, int month, int day, int hour, int minute){
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
