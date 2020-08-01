package org.maktab.store;

public class WinterDiscountStrategy  implements DiscountStrategy {
    @Override
    public long priceByDiscount(Clothing clothing) {
        Seasons seasons=clothing.getSeason();
        long priceByDiscount=0;
        switch (seasons){
            case Fall:
                priceByDiscount= (long) ( clothing.getBacePrice() - clothing.getBacePrice()*0.4);
                break;
            case Winter:
                priceByDiscount=(long)(clothing.getBacePrice()-clothing.getBacePrice()*0.5);
                break;
            case Summer:
                priceByDiscount=(long)(clothing.getBacePrice()-clothing.getBacePrice()*0.25);
                break;
            default:
                System.out.println("The chapter is not entered correctly");
                break;

        }
        if (clothing instanceof Jacket)priceByDiscount= (long) (priceByDiscount-priceByDiscount*0.1);
        return priceByDiscount;
    }
}
