package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage
       extends House {

    // TODO - Put your code here.
      private boolean mSecondFloor;

      public Cottage(int dimension, int lotLength, int lotWidth) // constructor
      {
           super(dimension,dimension,lotLength,lotWidth);
           mSecondFloor = false; //sets mSecondFloor to false
      }
      public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean secondFloor) // constructor
      {
           super(dimension,dimension,lotLength,lotWidth,owner);
           this.mSecondFloor = secondFloor;
      }
      public boolean hasSecondFloor(){ //return boolean value
           return mSecondFloor;
      }
      public String toString(){ //overriden toString method
        String a = super.toString();

        if(mSecondFloor == false){
            a.concat("; is a cottage");
        }
        if(mSecondFloor == true){
            a.concat("; is a two story cottage");
        }
        return a;
      }
}

