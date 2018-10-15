/**
 * @Project: Dice_forge
 * @Author:
 * @Copyright: Copyright (c) 2018
 * @University: Polytech Nice-Sophia
 */
public class DiceSide {
    String name;
    int point;

    public DiceSide(String name, int point){
        this.name = name;
        this.point = point;
    }

    String getName(){
        return name;
    }

    int getPoint(){
        return point;
    }
}
