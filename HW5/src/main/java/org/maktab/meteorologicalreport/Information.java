package org.maktab.meteorologicalreport;

public class Information  {
    private String city;
    private String date;
    private long amount;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Information() {
    }

    public Information(String cityName, String date, long amount)  {
        this.city = cityName;
        if (date.matches("^[0-9]{4}/[0-9]{2}/[0-9]{2}"))
        this.date = date;

        this.amount=amount;
    }

    public String getCityName() {
        return city;
    }

    public void setCityName(String cityName) {
        this.city = cityName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date)throws Exception {
        if (date.matches("^[0-9]{4}/[0-9]{2}/[0-9]{2}"))
        this.date = date;
        else throw new Exception("Bad input");
    }



    @Override
    public String toString() {
        return "Information{" +
                "cityName='" + city+ '\'' +
                ", date='" + date + '\'' +
                ", Rainfall=" + amount +
                '}';
    }

  /*  @Override
    public int compareTo(Information o) {
        char a=o.city.charAt(0);
        char b=this.city.charAt(0);
        if (a>b)return 1;
        if(a==b)return 0;
        return -1;


    }*/
}
