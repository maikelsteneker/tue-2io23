package ogo.spec.game.model;

enum ChangeType {
    MOVE_CREATURE, HEALTH, ENERGY, ATTACKING_CREATURE
}

public class Change
{
    public long tick;
    public Player player;

    public ChangeType type;

    public Creature creature;

    // for MOVE_CREATURE
    public int x;
    public int y;

    // for HEALTH / ENERGY
    public int newValue;

    // for ATTACKING_CREATURE
    public int otherCreatureId;
}