package StrategyBasedDesign;

public class FlyWithWings implements IFlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm Flying!!!");
    }
}
