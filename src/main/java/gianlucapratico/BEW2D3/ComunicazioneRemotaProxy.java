package gianlucapratico.BEW2D3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

class ComunicazioneRemotaProxy implements ComunicazioneRemota {
	@Override
	public void inviaAllarme(String idSonda, double latitude, double longitude, int smokeLevel) {
		String url = "http://host/alarm?idsonda=" + idSonda + "&lat=" + latitude + "&lon=" + longitude + "&smokelevel="
				+ smokeLevel;

		try {
			// Effettua la chiamata HTTP per inviare l'allarme al personale competente
			HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
			connection.setRequestMethod("GET");
			int responseCode = connection.getResponseCode();

			if (responseCode == HttpURLConnection.HTTP_OK) {
				System.out.println("Allarme inviato con successo");
			} else {
				System.out.println("Si è verificato un errore durante l'invio dell'allarme");
			}
		} catch (IOException e) {
			System.out.println("Si è verificata un'eccezione durante l'invio dell'allarme: " + e.getMessage());
		}
	}
}