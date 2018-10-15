package designmode.strategy;

/**
 * 策略模式
 */
public class StrategyContent {

    Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void travel(){
        if(strategy != null){
            strategy.travel();
        }
    }
}

//使用
// TravelContext travelContext=new TravelContext();
// travelContext.setStrategy(new PlaneStrategy());
// travelContext.travel();
