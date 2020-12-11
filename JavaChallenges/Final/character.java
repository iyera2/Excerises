public class character{
    private int strength;
    private int toughness;
    private int intelligence;
    private int magic;
    private int influence;

    public character(int strength, int toughness, int intelligence, int magic, int influence){
        this.strength = strength;
        this.toughness = toughness;
        this.intelligence = intelligence;
        this.magic = magic;
        this.influence = influence;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public int getStrength(){
        return strength;
    }

    public void setToughness(int toughness){
        this.toughness = toughness;
    }

    public int getToughness(){
        return toughness;
    }

    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }

    public int getIntelligence(){
        return intelligence;
    }

    public void setMagic(int magic){
        this.magic = magic;
    }

    public int getMagic(){
        return magic;
    }

    public void setInfluence(int influence){
        this.influence = influence;
    }

    public int getInfluence(){
        return influence;
    }

    public String toString(){
        return "Strength: " + getStrength() + ",Toughness: " + getToughness() + ",Intelligence: " + getIntelligence() + ",Magic: " + getMagic()+ ",Influence: " + getInfluence();
    }
}