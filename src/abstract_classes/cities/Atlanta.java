package abstract_classes.cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		int tax = population * ((int)growthRate * 2);
		return tax;
	}
}
