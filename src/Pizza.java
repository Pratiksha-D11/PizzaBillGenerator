public class Pizza{
	private int Price;
	private Boolean veg;
	private int ExtraCheese=100;
	private int ExtraToppingAdded=150;
	private int backpack=20;

	private boolean isExtracheeseadded=false;
	private boolean isExtraToppingsadded=false;
	private boolean isoptedfortakaway=false;


	public Pizza(Boolean veg) {
		this.veg=veg;
		if(this.veg){
			this.Price=300;
			System.out.println(this.Price);
		}else {
			this.Price=400;
			System.out.println(this.Price);
		}
	}

	public void addExtraCheese() {

		isExtracheeseadded=true;
		//System.out.println("Extra cheese added");
		this.Price+=ExtraCheese;

	}
	public void addExtraToppings() {
		isExtraToppingsadded=true;
		//System.out.println("Extra Toppings Added");
		this.Price+=ExtraToppingAdded;
	}
	public void takeAway() {

		//	System.out.println("tackaway opted extra 20 ruppes added for backpack");
		this.Price+=backpack;

	}
	public void getbill() {
		String bill="";
		//System.out.println(this.Price);

		if(isExtracheeseadded) {
			bill+="Extra cheese added :"+ExtraCheese+"\n";
		}
		if(isExtraToppingsadded) {
			bill+="Extra Toppings added :"+ExtraToppingAdded+"\n";
		}
		if(isoptedfortakaway) {
			bill+=" backpack added :"+backpack+"\n";
		}
		bill+="Bill :"+this.Price+ "\n";
		System.out.println(bill);

	}
}