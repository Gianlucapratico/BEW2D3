package gianlucapratico.BEW2D3;

//Classe Sonda (implementa l'interfaccia Observer)
class Sonda implements Observer {
	private String id;
	private int smokeLevel;
	private CentroControllo centroControllo;

	public Sonda(String id, CentroControllo centroControllo) {
		this.id = id;
		this.centroControllo = centroControllo;
		this.centroControllo.registerObserver(this);
	}

	// Implementazione del metodo dell'interfaccia Observer
	@Override
	public void update() {
		// Azioni da eseguire quando viene rilevato un incendio
		System.out.println("Incendio rilevato nella sonda " + id);
	}

	// Altri metodi getter e setter
	public String getId() {
		return id;
	}

	public int getSmokeLevel() {
		return smokeLevel;
	}

	public void setSmokeLevel(int smokeLevel) {
		this.smokeLevel = smokeLevel;
	}

	public double getLatitude() {
		// TODO Auto-generated method stub
		return 0;
	}
}
