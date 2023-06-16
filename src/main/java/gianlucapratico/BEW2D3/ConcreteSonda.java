package gianlucapratico.BEW2D3;

class ConcreteSonda implements Sonda1 {
	private String id;
	private double latitude;
	private double longitude;
	private int smokeLevel;

	public ConcreteSonda(String id, double latitude, double longitude, int smokeLevel) {
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.smokeLevel = smokeLevel;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public double getLatitude() {
		return latitude;
	}

	@Override
	public double getLongitude() {
		return longitude;
	}

	@Override
	public int getSmokeLevel() {
		return smokeLevel;
	}

	public void setLatitude(double latitude) {
		// TODO Auto-generated method stub

	}

	public void setLongitude(double longitude) {
		// TODO Auto-generated method stub

	}

	public void setSmokeLevel(int smokeLevel) {
		// TODO Auto-generated method stub

	}
}
