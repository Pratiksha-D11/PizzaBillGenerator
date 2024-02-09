
public class deluxPizza extends Pizza {

	public deluxPizza(Boolean veg) {
		super(veg);
		// TODO Auto-generated constructor stub
//		P.addExtraCheese();
//		P.addExtraToppings();
//	P.takeAway();
//	P.getbill();
	
		deluxPizza dp=new deluxPizza(true);
		dp.addExtraCheese();
		dp.addExtraToppings();
		dp.getbill();
		
	}
	

}
