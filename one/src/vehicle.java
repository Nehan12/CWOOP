public abstract class vehicle{
    protected String type;
    protected String plateNumber;
    protected String color;
    protected int entryDay;
    protected int entryMonth;
    protected int entryYear;
    protected int entryHour;
    protected int entryMinute;
    protected int exitDay;
    protected int exitMonth;
    protected int exitYear;
    protected int exitHour;
    protected int exitMinute;
    int total1 = entryHour*60 + entryMinute;
    int total2 = exitHour*60 + exitMinute;
    int time = total2 - total1;

    public int getEntryDay() {
        return entryDay;
    }

    public void setEntryDay(int entryDay) {
        this.entryDay = entryDay;
    }



    public vehicle() {
        super();
        plateNumber = null;
        color = null;
    }

    public vehicle(String plateNumber, String color) {
        super();
        this.plateNumber = plateNumber;
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public abstract String getType();
    public abstract String getName();

    public String toString(){
        return "\nplate number = " + plateNumber + " Type: "+type + " \nentered on " + entryYear+"/"+entryMonth+"/"+entryDay+" at "+entryHour+":"+entryMinute+"\n" ;
    }
}
