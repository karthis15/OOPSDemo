package DemoOOPS;

interface Soupmaker {      
	boolean water = true;
	boolean electricOven = true;
	boolean soupMasala =  true;
    void readymade();                //abstract methods 	
	 // interface method (does not have a body)
}
class VegSoup implements Soupmaker{    //to be implements on VegSoup
	public void readymade() {	
		boolean vegetable=true;
		if(water&&electricOven&&soupMasala &&vegetable)
			System.out.println("veg Soups");
		else
			System.out.println("veg Soups can't make it..");
	}	
}
class NonVegSoup implements Soupmaker{          ////to be implements on NonVegSoup
	public void readymade() {	
		boolean NonVeg=true;
		if(water&&electricOven&&soupMasala &&NonVeg)
			System.out.println("Non_veg Soups");
		else
			System.out.println("Non_veg Soups can't make it..");
		
	}
}

