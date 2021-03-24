
public class SemiLuxuryCAR implements SemiLuxury {
	public String name;

	public SemiLuxuryCAR(String name) {
		this.name = name;
	}
	@Override
	public String getSemiLuxuryName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getSemiLuxuryFeatures() {
		// TODO Auto-generated method stub
		return "Semi-Luxury car features";
	}

}
