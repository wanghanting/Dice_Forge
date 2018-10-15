/**
 * @Project: Dice_forge
 * @Author:
 * @Copyright: Copyright (c) 2018
 * @University: Polytech Nice-Sophia
 */
public class Robot {
    String name;
    Resource resource;

    public Robot(String name, Resource resource){
        this.name = name;
        this.resource = resource;
    }

    @Override
    public String toString(){
        return "Robot: " + name + resource.toString();
    }

}
