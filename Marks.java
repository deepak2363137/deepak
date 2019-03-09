 package pack26;

public class Marks {

	private int phy,chem,bio;

	public int getPhy() {
		return phy;
	}

	public void setPhy(int phy) {
		this.phy = phy;
	}

	public int getChem() {
		return chem;
	}

	public void setChem(int chem) {
		this.chem = chem;
	}

	public int getBio() {
		return bio;
	}

	public void setBio(int bio) {
		this.bio = bio;
	}
	
	public String toString() {
		
		return "marks [phy="+phy+",chem="+chem+",bio= "+bio+"]";
		
	}
}
