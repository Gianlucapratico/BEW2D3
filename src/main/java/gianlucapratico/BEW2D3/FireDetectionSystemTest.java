package gianlucapratico.BEW2D3;

class FireDetectionSystemTest {
	void testFireDetection() {
		CentroControllo centroControllo = new CentroControllo();
		ComunicazioneRemotaProxyStub comunicazioneRemotaProxy = new ComunicazioneRemotaProxyStub();
		ConcreteSondaImpl sonda = new ConcreteSondaImpl("1", 41.1234, 12.5678, 7);
		centroControllo.notificaIncendio(sonda, comunicazioneRemotaProxy);

		assertTrue(comunicazioneRemotaProxy.isInviaAllarmeCalled());
	}

	private void assertTrue(boolean inviaAllarmeCalled) {
		// TODO Auto-generated method stub

	}
}