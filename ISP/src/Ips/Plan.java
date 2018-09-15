package Ips;

public class Plan {
public int Speed;
public int Price;
public int Download;
public int bill;


public plan(int Speed, int Dounload,int price, int bill) {
	
	this.Speed= Speed;
	this.Price=price;
	this.Download=Download;
	this.bill= bill;
	
	
	
	}
public void setSpeed(int speed) {
	this.Speed =Speed;
}

}

public String getInfo() {
	return "Your bill";
}
	public static String getPlan() {
		return "Your bill for the month for";
	}

}
	
}
