package com.company.example_2;

public class HeroFactoryImp {
    private Mage mage;
    private Warold warlord;
    private Beast beast;

    /**
     * Constructor
     */
    public HeroFactoryImp(Mage mage, Warold warlord, Beast beast) {
        this.mage = mage;
        this.warlord = warlord;
        this.beast = beast;
    }

    /**
     * Create mage
     */
    public Mage createMage() {
        try {
            return mage.copy();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    /**
     * Create warlord
     */
    public Warold createWarlord() {
        try {
            return warlord.copy();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    /**
     * Create beast
     */
    public Beast createBeast() {
        try {
            return beast.copy();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
