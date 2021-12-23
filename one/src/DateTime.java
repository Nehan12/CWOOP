public class DateTime {

        private int day;
        private int month;
        private int year;
        private int hour;
        private int minute;

        public DateTime(int day, int month, int year, int hour, int minute) {
            super();
            setDay(day);
            setMonth(month);
            setYear(year);
            setHour(hour);
            setMinute(minute);

        }



        public void setDay(int day) {
            if (day>=1 && day<=31) {
                this.day = day;
            }
            else {
                throw new IllegalArgumentException(" Day should be in between 1 and 31");
            }
        }

        public int getDay() {
            return day;
        }

        public void setMonth(int month) {
            if (month>=1 && month<=12) {
                this.month = month;
            }
            else {
                throw new IllegalArgumentException(" Month should be in between 1 and 12");
            }
        }

        public int getMonth() {
            return month;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        public int getHour() {
            return hour;
        }

        public void setHour(int hour) {
            if (hour>=1 && hour <= 24) {
                this.hour = hour;
            }
            else {
                throw new IllegalArgumentException(" Hours should be in between 1 and 24");
            }
        }



        public void setMinute(int minute) {
            if (minute>=1 && minute <= 59) {
                this.minute = minute;
            }
            else {
                throw new IllegalArgumentException(" Minutes should be in between 1 and 59");
            }
        }

        public int getMinute() {
            return minute;
        }

//    public boolean compareTo(DateTime date) {
//        int d = date.getDay();
//        int m = date.getMonth();
//        int y = date.getYear();
//        return (this.year <= y) && (this.month <= m) && (this.day <= d);
//    }
//
//    public boolean compareToT(DateTime time) {
//        int h = getHour();
//        int mi = getMinute();
//        return (this.hour <= h) && (this.minute <= mi);
//    }

        public void setTime (int d, int m, int y, int h, int mi) {
            day = getDay();
            month =getMonth();
            year = getYear();
            hour = getHour();
            minute = getMinute();
        }

//        public String toDate() {
//            return String.format("%02d:%02d:%04d %02d:%02d", day, month, year, hour, minute);
//        }

    @Override
    public String toString() {
        return "DateTime [ day=" + day + ", month=" + month + ", year=" + year + "/ " + ", " +
                "hour=" + hour + ", minute=" + minute + "]";
    }

//        public String getDateTime() {
//            return this.getDay()+"/"+ this.getMonth()+"/"+ this.getYear()+" "+this.getHour()+":"+this.getMinute();
//        }




}
