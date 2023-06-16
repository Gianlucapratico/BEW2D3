package gianlucapratico.BEW2D3;

class ComunicazioneRemotaProxyStub implements ComunicazioneRemota {
	private boolean isInviaAllarmeCalled = false;

	@Override
	public void inviaAllarme(String idSonda, double latitude, double longitude, int smokeLevel) {
		isInviaAllarmeCalled = true;
		// Implementa qui la logica desiderata per il test
	}

	public boolean isInviaAllarmeCalled() {
		return isInviaAllarmeCalled;
	}
}
