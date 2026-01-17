package IceCreamRush;

public class IceCream {
	public String name;
    public int sold;
    
    public IceCream(String name, int sold) {
  	   this.name = name;
  	   this.sold = sold;
    }
    
    @Override
  public String toString() {
    return "\nFlavour : "+this.name+" | Unit Sold : "+this.sold;
  }
}
