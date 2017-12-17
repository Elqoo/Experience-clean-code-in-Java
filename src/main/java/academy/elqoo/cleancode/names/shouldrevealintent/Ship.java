package academy.elqoo.cleancode.names.shouldrevealintent;


import java.util.Random;

// Represents a ship in our game
public class Ship implements GameObject {

    private ShipStatus status;

    private int health; // indicates how many hitpoints the ship has

    private int hitPoints; // say how many hitpoints are deducted from a ships health when attached by this ship

    public static Ship createWithHealthAndPower(int health, int power){ // creates a ship with health and power
        return new Ship(health, power);
    }

    public static Ship createRandom(){ // creates a random ship
        Random random = new Random(5);
        return createWithHealthAndPower(random.nextInt(), random.nextInt());
    }


    public Ship(int health, int hitPoints) {
        this.health = health;
        this.hitPoints = hitPoints;
        this.status = ShipStatus.ALIVE;
    }

    public int getHealth() {
        return health;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void destroy(){  // destroys this Ship by reducing the health points to zero
        this.health = 0;
        this.status = ShipStatus.DEAD;
    }

    public boolean isDestroyed(){ // checks if this Ship is still alive
        return health != 0;
    }

    public void acceptFireFrom(Ship ship){ // takes an enemy fire from the parameter passed ship
        if(ship.getHitPoints()> this.health){
            this.destroy();
        }else {
            this.health -= ship.getHitPoints();
        }
    }

    public void fireOn(Ship enemy){ // attacks an enemy ship
        this.status = ShipStatus.ATTACKING;
        enemy.acceptFireFrom(this);
        this.status = ShipStatus.ALIVE;
    }

    public ShipStatus getStatus() {
         return status;
    }

    public void clone(Ship ship){
        this.health = ship.getHealth();
        this.hitPoints = ship.getHitPoints();
        this.status = ship.getStatus();
    }
}
