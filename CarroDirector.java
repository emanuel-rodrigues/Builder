package Builder;

public class CarroDirector {
	
	protected CarroProductBuilder montadora;
	
	public CarroDirector(CarroProductBuilder montadora){
		this.montadora = montadora;		
	}
	/*
	public void construirCarro(){
		montadora.builderModelo("UNO")
		.builderMarca("FIAT")
		.builderCor("VERMELHO")
		.builderAnoFabricacao(2017)
		.builderAnoModelo(2018).builderMarca("VOLKS");
	}
	*/
	public CarroProduct construir(){
		return montadora.getCarro();
	}

}
