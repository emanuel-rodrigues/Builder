package Builder;

public class FiatBuilder extends CarroProductBuilder{
	
	public FiatBuilder() {
		System.out.println("CRIADO FIATBUILDER");
	}

	@Override
	FiatBuilder builderMarca(String marca) {
		carro.marca = marca;
		return this;
		
	}

	@Override
	FiatBuilder builderModelo(String modelo) {
		carro.modelo = modelo;
		return this;
	}

	@Override
	FiatBuilder builderCor(String cor) {
		carro.cor = cor;
		return this;
	}

	@Override
	FiatBuilder builderAnoFabricacao(int AnoFabricacao) {
		carro.anoDeFabricacao = AnoFabricacao;
		return this;
	}

	@Override
	FiatBuilder builderAnoModelo(int AnoModelo) {
		carro.anoModelo = AnoModelo;
		return this;
	}

}
