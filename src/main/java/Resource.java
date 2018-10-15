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

    int getPoint(){
        return point;
    }

    void addPoint(int n){
        point += n;
    }

    void minusPoint(int n){
        point -= n;
    }

    int getGold(){
        return gold;
    }

    void addGold(int n){
        gold += n;
    }

    private void minusGold(int n){
        gold -= n;
    }

    @Override
    public String toString(){
        return "point: " + point + " gold: " + gold;
    }

    public void setPoint(int n) {
        this.point = n;
    }

    public void setGold(int n) {
        this.gold = n;
    }
}
