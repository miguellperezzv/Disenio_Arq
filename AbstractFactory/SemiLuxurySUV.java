
public class SemiLuxurySUV implements SemiLuxury {

	public String name;
	public SemiLuxurySUV(String name) {
		this.name=name;
	}
	@Override
	public String getSemiLuxuryName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getSemiLuxuryFeatures() {
		// TODO Auto-generated method stub
		return "Semi-Luxury SUV features";
	}

}
