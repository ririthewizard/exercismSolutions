class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class

class Warrior extends Fighter {
    @Override
    boolean isVulnerable() { return false; }

    @Override
    int getDamagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10 : 6;
    }

    @Override
    public String toString() { return "Fighter is a Warrior"; }
}

// TODO: define the Wizard class

class Wizard extends Fighter {

    private boolean spellPrepared = false;

    public void prepareSpell() {
        spellPrepared = true;
    }

    @Override
    boolean isVulnerable() { return !spellPrepared; }

    @Override
    int getDamagePoints(Fighter warrior) {
        return spellPrepared ? 12 : 3;
    }

    @Override
    public String toString() { return "Fighter is a Wizard"; }
}