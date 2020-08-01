package org.maktab.store;

public class YaldaDiscountStrategy implements DiscountStrategy {


    @Override
    public long priceByDiscount(Clothing clothing) {

        long priceByDiscount=0;
        if (clothing instanceof Jacket)priceByDiscount= (long) (clothing.getBacePrice()-clothing.getBacePrice()*0.1);
        else if (clothing instanceof Socks)priceByDiscount= (long) (clothing.getBacePrice()-clothing.getBacePrice()*0.2);
        else priceByDiscount= (long) (clothing.getBacePrice()-clothing.getBacePrice()*0.25);
        return priceByDiscount;
    }
}
