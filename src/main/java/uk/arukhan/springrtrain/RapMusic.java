package uk.arukhan.springrtrain;

public class RapMusic implements Music{

    private RapMusic() {}

    public static RapMusic getRapMusic(){
        return new RapMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Destoy");
    }
    @Override
    public String getSong() {
        return "Million Dollar Happiness";
    }
}
