package abstract_classes.cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		double tax = 1000000 + population * growthRate;
		return tax;
	}

}
