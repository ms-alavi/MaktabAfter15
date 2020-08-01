package org.maktab.meteorologicalreport;

class CityMonthInformation implements Comparable<CityMonthInformation>{
    private String city;
    private int month;
    private double average;

    public CityMonthInformation(String city, int month, double average) {
        this.city = city;
        this.month = month;
        this.average = average;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public int compareTo(CityMonthInformation o) {
        if (this.month>o.month)return 1;
        if (this.month==o.month)return 0;
        return -1;
    }
}
