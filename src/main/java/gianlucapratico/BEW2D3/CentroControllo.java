package gianlucapratico.BEW2D3;

import java.util.ArrayList;
import java.util.List;

//Classe CentroControllo (implementa l'interfaccia Subject)
class CentroControllo implements Subject {
	private List<Observer> observers;

	public CentroControllo() {
		this.observers = new ArrayList<>();
	}

	// Implementazione dei metodi dell'interfaccia Subject
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	// Metodo notificaIncendio per rilevare e gestire gli incendi
	public void notificaIncendio(ConcreteSondaImpl sonda, ComunicazioneRemota comunicazioneRemota) {
		double latitude = sonda.getLatitude();
		double longitude = sonda.getLatitude();
		int smokeLevel = sonda.getSmokeLevel();

		if (smokeLevel > 5) {
			notifyObservers(); // Notifica gli osservatori

			// Invia l'allarme tramite la comunicazione remota
			comunicazioneRemota.inviaAllarme(sonda.getId(), latitude, longitude, smokeLevel);
		}
	}
}
