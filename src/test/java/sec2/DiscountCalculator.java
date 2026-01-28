package sec2;

public class DiscountCalculator {

    public double caluclateDiscount(int amount){
        if(amount < 0){
            throw new IllegalArgumentException("金額は0異常である必要があります");
        }

        if(amount < 5000){
            return 0;
        } else if(amount < 10000){
            return amount * 0.05;
        } else {
            return amount * 0.1;
        }
    }
}
