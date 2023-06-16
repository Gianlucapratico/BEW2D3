package gianlucapratico.BEW2D3;

interface ComunicazioneRemota {
	void inviaAllarme(String idSonda, double latitude, double longitude, int smokeLevel);
}
