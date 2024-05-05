package org.prototype.entities;

public class Knight extends HumanUnit {
    private String state;

    public Knight() {
        super();
        this.state = "idle";
    }

    /**
     * When a knight is reset or cloned, his state will always be initially idle
     */
    @Override
    public void reset() {
        this.state = "idle";
    }

    public void attack() {
        this.state = "attacking";
    }

    @Override
    public String toString() {
        return "Knight{" +
                "state='" + state + '\'' +
                '}';
    }
}
