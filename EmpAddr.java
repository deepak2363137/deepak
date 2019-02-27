package pack26;

public class EmpAddr {

   private int streetno;
    private String colony,city,state;
public int getStreetno() {
	return streetno;
}
public void setStreetno(int streetno) {
	this.streetno = streetno;
}
public String getColony() {
	return colony;
}
public void setColony(String colony) {
	this.colony = colony;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
   
public String toString() {
	
	return " [ Streetno " + streetno + " colony " + colony + " city " + city + " state  " + state + "]";
	
}
}