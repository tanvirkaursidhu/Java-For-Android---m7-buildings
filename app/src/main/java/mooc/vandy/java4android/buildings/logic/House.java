package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House
       extends Building {

    // TODO - Put your code here.
    private String mOwner;
    private boolean mPool;

    public House(int length, int width, int lotLength, int lotWidth) // constructor
    {
        super(length,width,lotLength,lotWidth); //using super keyword
        mOwner = null ; //set mOwner to null
        mPool = false; //set mPool to false
    }
    public House(int length, int width, int lotLength, int lotWidth, String owner) //constructor
    {
        super(length,width,lotLength,lotWidth);
        setOwner(owner);
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) // constructor
    {
        super(length,width,lotLength,lotWidth);
        setOwner(owner);
        setPool(pool);
    }

    public String getOwner(){ //return mOwner
        return mOwner;
    }

    public boolean hasPool(){ //return boolean value
        return mPool;
    }
    public void setOwner(String owner) { //set mOwner
        mOwner = owner;
    }
    public void setPool(boolean pool) { //set mPool
        mPool = pool;
    }

    public String toString() { //overriden toString method
        return "Owner: " + (mOwner!=null ? mOwner : "n/a") +
                (hasPool() ? "; has a pool" : "") +
                (calcLotArea() > calcBuildingArea() ? "; has a big open space" : "");
    }

    public boolean equals(Object o) {//check whether two objects are equal
        if (!(o instanceof House)) return false;
        House house = (House) o;
        return (mPool == house.hasPool()) && (calcBuildingArea() == house.calcBuildingArea());

    }
}
