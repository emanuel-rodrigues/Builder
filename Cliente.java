package Builder;

public class Cliente {

	public static void main(String[] args) {
		
		CarroDirector montadora = new CarroDirector(new FiatBuilder()
				.builderModelo("PALIO")
				.builderMarca("FIAT")
				.builderCor("VERMELHO")
				.builderAnoFabricacao(2017)
				.builderAnoModelo(2018));
		
		CarroProduct carro = montadora.construir();
		
		System.out.println(carro);
		
		
		
		
		
		
		

	}

}
