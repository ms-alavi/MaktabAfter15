package org.maktab.store;

public class Clothing {
    private String name;
    private Seasons season;
    private double bacePrice;
    private DiscountStrategy discountStrategy;

    public Clothing(String name, Seasons season, double bacePrice) {
        this.name = name;
        this.season = season;
        this.bacePrice = bacePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Seasons getSeason() {
        return season;
    }

    public void setSeason(Seasons season) {
        this.season = season;
    }

    public double getBacePrice() {
        return bacePrice;
    }

    public void setBacePrice(double bacePrice) {
        this.bacePrice = bacePrice;
    }
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
this.discountStrategy=discountStrategy;

        }
    public long getPrice () {
        if (discountStrategy instanceof WinterDiscountStrategy){
            WinterDiscountStrategy winterDiscountStrategy=(WinterDiscountStrategy)discountStrategy;
            return winterDiscountStrategy.priceByDiscount(this);
        }
        else if (discountStrategy instanceof SummerDiscountStrategy){
            SummerDiscountStrategy summerDiscountStrategy=(SummerDiscountStrategy)discountStrategy;
            return summerDiscountStrategy.priceByDiscount(this);
        }
        else if (discountStrategy instanceof YaldaDiscountStrategy){
            YaldaDiscountStrategy yaldaDiscountStrategy=(YaldaDiscountStrategy)discountStrategy;
            return yaldaDiscountStrategy.priceByDiscount(this);
        }
        else return (long) getBacePrice();

    }


    }
