package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office
       extends Building {

    // TODO - Put your code here.
     private String mBusinessName;
     private int mParkingSpaces;
     private static int sTotalOffices=0; //static variable

     public Office(int length, int width, int lotLength, int lotWidth) // constructor
     {
         super(length,width,lotLength,lotWidth); //using super keyword
         mBusinessName = null;
         mParkingSpaces = 0;
         sTotalOffices++;
     }
     public Office(int length, int width, int lotLength, int lotWidth, String businessName)// constructor
     {
         super(length,width,lotLength,lotWidth);
         setBusinessName(businessName);
         sTotalOffices++; //increment sTotalOffices by one
     }
     public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces) // constructor
     {
         super(length,width,lotLength,lotWidth);
         setBusinessName(businessName);
         setParkingSpaces(parkingSpaces);
         sTotalOffices++;
     }

     public String getBusinessName() { //get mBusinessName
         return mBusinessName;
     }

     public int getParkingSpaces() { //get mParkingSapces
         return mParkingSpaces;
     }

     public static int getTotalOffices() // static method
     {
          return sTotalOffices;
     }

     public void setBusinessName(String businessName ) { //set mBusinessName
          mBusinessName = businessName;
     }

     public void setParkingSpaces(int parkingSpaces) { //set mParkingSpaces
          mParkingSpaces =  parkingSpaces;
     }

     public String toString() { //overriden toString method
        return "Business: " +
                (mBusinessName != null ? mBusinessName : "unoccupied") +
                (mParkingSpaces != 0 ? "; has " + mParkingSpaces + " parking spaces" : "") +
                " (total offices: " + sTotalOffices + ")";
     }

     public boolean equals(Object o) { //checks whether two objects are equal

        if (!(o instanceof Office)) return false; //using instanceof

        Office office = (Office) o; //casting of object

        return (getParkingSpaces() == office.getParkingSpaces()) && (calcBuildingArea() == office.calcBuildingArea());
     }
}
