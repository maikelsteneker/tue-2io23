package ogo.spec.game.model;

public class LandCreature extends Creature
{

    @Override
    protected int getMoveSpeed(TileType tileType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected int getEatValue(Creature creature) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}