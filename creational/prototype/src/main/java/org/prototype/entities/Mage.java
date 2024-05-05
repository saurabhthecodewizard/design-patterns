package org.prototype.entities;

public class Mage extends HumanUnit {

    private String state;

    public Mage() {
        super();
        this.state = "idle";
    }

    public void boostMagic() {
        this.state = "practicing witchcraft";
    }

    /**
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public HumanUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Mages are unique!");
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Reset not supported!");
    }
}
