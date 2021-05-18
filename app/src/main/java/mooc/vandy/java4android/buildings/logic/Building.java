package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {

    // TODO - Put your code here.
       private int mLength;
       private int mWidth;
       private int mLotLength;
       private int mLotWidth;

       public Building(int length, int width, int lotLength, int lotWidth) // constructor
       {
             setLength(length);
             setWidth(width);
             setLotLength(lotLength);
             setLotWidth(lotWidth);
       }

       public int getLength(){//return length
           return mLength;
       }
       public int getWidth(){//return width
           return mWidth;
       }
       public int getLotLength(){//return lot length
           return mLotLength;
       }
       public int getLotWidth() { //return lot width
           return mLotWidth;
       }
       public void setLength(int length) {//set length
            mLength = length;
       }
       public void setWidth(int width) {//set width
            mWidth = width;
       }
       public void setLotLength(int lotLength){//set lot length
            mLotLength = lotLength;
       }
       public void setLotWidth(int lotWidth){//set lot width
            mLotWidth = lotWidth;
       }
       public int calcBuildingArea() {//calculate building area
            return (mLength * mWidth);
       }
       public int calcLotArea(){ //calculate lot area
           return (mLotLength * mLotWidth);
       }
       public String toString(){
           return ("a " + (mLength*mWidth) + " building");
       }


    
}
