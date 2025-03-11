package Classes;

import java.util.Random;

public class Player {
    private String forename;
    private String surname;
    private int age;
    private String bowlStyle;
    private String role;
    private Boolean isRightHanded;
    public Player(String role, float baseAbility)
    {
        Random rnd = new Random();
        forename = Globals.engFNames[rnd.nextInt(Globals.engFNames.length)];
        surname = Globals.engSNames[rnd.nextInt(Globals.engSNames.length)];

    }
    public Player()
    {
        Random rnd = new Random();
        forename = Globals.engFNames[rnd.nextInt(Globals.engFNames.length)];
        surname = Globals.engSNames[rnd.nextInt(Globals.engSNames.length)];
        role = Globals.roles[rnd.nextInt(Globals.roles.length)];
        age = rnd.nextInt(17, 46);
        int temp = rnd.nextInt(1, 6);
        if(temp == 1){
            isRightHanded = false;
            bowlStyle = Globals.leftHandBowlStyles[Globals.leftHandBowlStyles.length];
        }
        else{
            isRightHanded = true;
            bowlStyle = Globals.rightHandBowlStyles[Globals.rightHandBowlStyles.length];
        }
    }
    //Getters and Setters
    public String getForename(){
        return forename;
    }
    public String getSurname(){
        return surname;
    }
    public String getRole(){
        return role;
    }
    public int getAge(){
        return age;
    }
    public String getBowlStyle(){
        return bowlStyle;
    }
}
