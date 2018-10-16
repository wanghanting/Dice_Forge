/**
 * @Project: Dice_forge
 * @Author:
 * @Copyright: Copyright (c) 2018
 * @University: Polytech Nice-Sophia
 */
public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor();

        motor.init();
        motor.game();
        motor.result();
    }
}
