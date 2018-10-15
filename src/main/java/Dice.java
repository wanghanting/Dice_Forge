import java.util.Random;

/**
 * @Project: Dice_forge
 * @Author:
 * @Copyright: Copyright (c) 2018
 * @University: Polytech Nice-Sophia
 */
public class Dice {
    String name;
    DiceSide[] side;
    public static final DiceSide point1 = new DiceSide("point", 1);
    public static final DiceSide gold1 = new DiceSide("gold", 1);
    public static final DiceSide gold2 = new DiceSide("gold", 2);

    public static final Dice solar = new Dice("solar", new DiceSide[]{point1, gold1, gold1, gold2, gold1, gold1});

    public Dice(String name, DiceSide[] side){
        this.name = name;
        this.side = side;
    }

    DiceSide roll(){
        Random r = new Random();
        return solar.side[r.nextInt(5)];
    }

}
