package org.maktab.meteorologicalreport;

class CityInformation implements Comparable<CityInformation> {
    private String city;
    private long sum;

    public CityInformation(String city, long sum) {
        this.city = city;
        this.sum = sum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }



    @Override
    public int compareTo(CityInformation o) {
        char a=o.city.charAt(0);
        char b=this.city.charAt(0);
        if (b>a)return 1;
        if(a==b)return 0;
        return -1;
    }
}
