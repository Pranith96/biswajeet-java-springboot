
public class Address {

	private int aId;
	private String plotNo;
	private String area;
	private String city;

	public Address(int aId, String plotNo, String area, String city) {
		this.aId = aId;
		this.plotNo = plotNo;
		this.area = area;
		this.city = city;
	}

	public Address() {
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(String plotNo) {
		this.plotNo = plotNo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [aId=" + aId + ", plotNo=" + plotNo + ", area=" + area + ", city=" + city + "]";
	}

}
