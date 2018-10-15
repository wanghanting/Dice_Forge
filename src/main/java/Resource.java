/**
 * @Project: Dice_forge
 * @Author:
 * @Copyright: Copyright (c) 2018
 * @University: Polytech Nice-Sophia
 */
public class Resource {
    int point;
    int gold;

    public Resource(int point, int gold){
        this.point = point;
        this.gold = gold;
    }

    private int getPoint(){
        return point;
    }

    private void addPoint(int n){
        point += n;
    }

    private void minusPoint(int n){
        point -= n;
    }

    private int getGold(){
        return gold;
    }

    private void addGold(int n){
        gold += n;
    }

    private void minusGold(int n){
        gold -= n;
    }

    @Override
    public String toString(){
        return "point: " + point + " gold: " + gold;
    }
}
