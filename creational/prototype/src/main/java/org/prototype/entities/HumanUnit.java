package org.prototype.entities;

public abstract class HumanUnit implements Cloneable {
    private int health;

    public HumanUnit() {
        // every human unit will begin with 75 health points
        this.health = 75;
    }

    /**
     * This method will clone all the human units.
     * If any human units do not support cloning, the provided CloneNotSupportedException is to be thrown from the overridden implementation
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public HumanUnit clone() throws CloneNotSupportedException {
        HumanUnit unit = (HumanUnit)super.clone();
        unit.initialize();

        return unit;
    }

    public void initialize() {
        this.health = 75;
        reset();
    }

    /**
     * Subclasses may have state of their own
     * This method will be overridden in subclasses to provide the initial state when performing the clone operation
     *
     * Should throw UnsupportedOperationException if the subclass state cannot be reset or does not support cloning
     */
    protected abstract void reset();
}
