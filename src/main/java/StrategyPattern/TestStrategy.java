package StrategyPattern;

public class TestStrategy {

    public static void main(String[] args) {
        Woman woman=new Woman();

        woman.setEmotion(new Angry());
        woman.talk();
        woman.eat();

        woman.setEmotion(new Happy());
        woman.talk();
        woman.walk();



    }




}
