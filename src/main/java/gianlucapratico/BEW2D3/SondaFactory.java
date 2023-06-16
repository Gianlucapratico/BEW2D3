package gianlucapratico.BEW2D3;

class SondaFactory {
	public static ConcreteSonda createSonda(String id, double latitude, double longitude, int smokeLevel) {
		return new ConcreteSonda(id, latitude, longitude, smokeLevel);
	}
}