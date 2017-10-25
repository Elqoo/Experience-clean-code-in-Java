package academy.elqoo.cleancode.names;


import java.util.Random;

// Represents a ship in our game
public class Ship implements GameObject {

    private ShipStatus status;

    private int health; // indicates how many hitpoints the ship has

    private int attackPower; // say how many hitpoints are deducted from a ships health when attached by this ship

    public static Ship createWithHealthAndPower(int health, int attackPower){ // creates a ship with health and power
        return new Ship(health, attackPower);
    }

    public static Ship createWithRandomHealthAndPower(){ // creates a random ship
        Random random = new Random(5);
        return createWithHealthAndPower(random.nextInt(), random.nextInt());
    }


    public Ship(int health, int attackPower) {
        this.health = health;
        this.attackPower = attackPower;
        this.status = ShipStatus.ALIVE;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void destroy(){  // destroys this Ship by reducing the health points to zero
        this.health = 0;
        this.status = ShipStatus.DEAD;
    }

    public ShipStatus getStaus() {
        return status;
    }

    public boolean isDestroyed(){ // checks if this Ship is still alive
        return health != 0;
    }

    public void takeAHit(Ship enemy){ // takes an enemy fire from the parameter passed ship
        if(enemy.getAttackPower()> this.health){
            this.destroy();
        }else {
            this.health -= enemy.getAttackPower();
        }
    }

    public void attack(Ship enemy){ // attacks an enemy ship
        this.status = ShipStatus.ATTACKING;
        enemy.takeAHit(this);
        this.status = ShipStatus.ALIVE;
    }

    public ShipStatus getStatus() {
         return status;
    }

    public void clone(Ship ship){
        this.health = ship.getHealth();
        this.attackPower = ship.getAttackPower();
        this.status = ship.getStatus();
    }
}
