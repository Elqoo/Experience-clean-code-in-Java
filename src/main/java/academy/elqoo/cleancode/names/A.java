package academy.elqoo.cleancode.names;


import java.util.Random;

// Represents a ship in our game
public class A implements IGameObject {

    private ShipStatus status;

    private int hp; // indicates how many hitpoints the ship has

    private int r_b; // say how many hitpoints are deducted from a ships hp when attached by this ship

    public static A woThisIsACoolCreateMethod(int hp, int b){ // creates a ship with hp and power
        return new A(hp, b);
    }

    public static A randomizer(){ // creates a random ship
        Random random = new Random(5);
        return woThisIsACoolCreateMethod(random.nextInt(), random.nextInt());
    }


    public A(int hp, int r_b) {
        this.hp = hp;
        this.r_b = r_b;
        this.status = ShipStatus.ALIVE;
    }

    public int getHp() {
        return hp;
    }

    public int getR_b() {
        return r_b;
    }

    public void destroy(){  // destroys this A by reducing the hp points to zero
        this.hp = 0;
        this.status = ShipStatus.DEAD;
    }

    public ShipStatus getStaus() {
        return status;
    }

    public boolean isDestroyed(){ // checks if this A is still alive
        return hp != 0;
    }

    public void boom(A enemy){ // takes an enemy fire from the parameter passed ship
        if(enemy.getR_b()> this.hp){
            this.destroy();
        }else {
            this.hp -= enemy.getR_b();
        }
    }

    public void c(A enemy){ // attacks an enemy ship
        this.status = ShipStatus.ATTACKING;
        enemy.boom(this);
        this.status = ShipStatus.ALIVE;
    }

    public ShipStatus getStatus() {
         return status;
    }

    public void clone(A a){
        this.hp = a.getHp();
        this.r_b = a.getR_b();
        this.status = a.getStatus();
    }
}
