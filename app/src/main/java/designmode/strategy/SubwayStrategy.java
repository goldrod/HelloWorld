package designmode.strategy;

public class SubwayStrategy implements Strategy {

    @Override
    public void travel() {
        System.out.println("subway");
    }
}
