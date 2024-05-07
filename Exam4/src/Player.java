public class Player extends Die {
    // name of player
    String name;
    // Die object player will roll
    Die die;

    public Player(String name, Die die) {
        this.name = name;
        this.die = die;
    }

    public String getName() {
        return this.name;
    }

    public Die getDie() {
        return this.die;
    }

    @Override
    public String toString() {
        return "Player " + getName() + " " + getDie();
    }


}

