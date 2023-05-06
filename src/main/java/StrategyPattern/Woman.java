package StrategyPattern;

public class Woman {
private Emotion emotion;

    public Emotion getEmotion() {
        return emotion;
    }

    public void setEmotion(Emotion emotion) {
        this.emotion = emotion;
    }

    void talk(){
    System.out.print("she talking ");
    emotion.reaction();
}

    void walk(){
        System.out.print("she walking ");
        emotion.reaction();
    }

    void eat(){
        System.out.print("she eating ");
        emotion.reaction();
    }

}
