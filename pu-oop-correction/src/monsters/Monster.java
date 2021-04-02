package monsters;

import java.awt.*;

public abstract class Monster {
    private int attackPoints, defencePoints, magicPower, speed;
    private Color color;

    public Monster(int attackPoints, int defencePoints, int magicPower, int speed, Color color){
        this.attackPoints = attackPoints;
        this.defencePoints = defencePoints;
        this.magicPower = magicPower;
        this.speed = speed;
        this.color = color;

    }
    public void render(Graphics g, int x,int y){
        g.setColor(color);
        g.fillRect(x*80,y*80+30,80,80);
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getDefencePoints() {
        return defencePoints;
    }

    public void setDefencePoints(int defencePoints) {
        this.defencePoints = defencePoints;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
