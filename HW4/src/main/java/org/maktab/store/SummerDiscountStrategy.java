package org.maktab.store;

public class SummerDiscountStrategy  implements DiscountStrategy{



    @Override
    public long priceByDiscount(Clothing clothing) {
        Seasons seasons=clothing.getSeason();
        long priceByDiscount=0;
        switch (seasons){
            case Spring:
                priceByDiscount= (long) ( clothing.getBacePrice() - clothing.getBacePrice()*0.4);
                break;
            case Summer:
                priceByDiscount=(long)(clothing.getBacePrice()-clothing.getBacePrice()*0.5);
                break;
            case Winter:
                priceByDiscount=(long)(clothing.getBacePrice()-clothing.getBacePrice()*0.3);
                break;
            default:
                System.out.println("The chapter is not entered correctly");
                break;

        }
        return priceByDiscount;
    }
}
