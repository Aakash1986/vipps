package com.java;

public abstract class Distance {

	protected int feet;
    protected float inches;

     abstract void setFeetAndInches(int feet, float inches);     

    abstract public int getFeet();
    
    //abstract public float getTotalInches();

    abstract public float getInches();

    abstract String getDistanceComparison(Distance dist2);
	
}
class DistanceImplementation extends Distance {


    @Override
    public void setFeetAndInches(int feet, float inches) {
        this.feet = feet;
        this.inches = inches;
    }

    @Override
    public int getFeet() {
        return this.feet;
    }

    @Override
    public float getInches() {
        return this.inches;
    }

    @Override
    String getDistanceComparison(Distance dist2) {

    	float myTotalInches = getTotalInches();
        float otherTotalInches = (float) ((float) feet * 12.0 + dist2.getInches());
    	//float otherTotalInches = (float)((float) feet * 12.0 + inches);
        
        if (myTotalInches > otherTotalInches) {
        	return "First distance is greater";
        } else if (myTotalInches < otherTotalInches) {            
            return "Second distance is greater";
        } else {
            return "Both distances are equal";
        }
    }
    
    private float getTotalInches() {
        return (float) ((float) feet * 12.0 + inches);
    } 
    
}