import com.sun.istack.internal.localization.NullLocalizable;

/**
 * @Project: Dice_forge
 * @Author:
 * @Copyright: Copyright (c) 2018
 * @University: Polytech Nice-Sophia
 */
public class Motor {
    Robot robot;
    Dice dice = Dice.solar;
    Resource resource;

    void init(){
        robot = new Robot("r1", resource);
        robot.resource = new Resource(0,0);
    }

    void game(){
        if (dice.roll().getName().equals("point")){
            robot.resource.addPoint(dice.roll().getPoint());
        }else if(dice.roll().getName().equals("gold")){
            robot.resource.addGold(dice.roll().getPoint());
        }else{
            System.out.println("");
        }
    }


    void result() {
        System.out.println("--------The result is--------");
        System.out.println("For the robot: " + robot.getName());
        System.out.println("Point: " + robot.resource.getPoint());
        System.out.println("Gold: " + robot.resource.getGold());
    }
}
