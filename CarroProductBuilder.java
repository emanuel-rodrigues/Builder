package Builder;

public abstract class CarroProductBuilder {
	
	//INTERFACE BUILDER
	
	
	protected CarroProduct carro;
	
	public CarroProductBuilder(){
		carro = new CarroProduct();
		System.out.println("CRIOU CARRO PRODUCT BUILDER");
	}
	
	abstract CarroProductBuilder builderMarca(String marca);
	abstract CarroProductBuilder builderModelo(String modelo);
	abstract CarroProductBuilder builderCor(String cor);
	abstract CarroProductBuilder builderAnoFabricacao(int AnoFabricacao);
	abstract CarroProductBuilder builderAnoModelo(int AnoModelo);
	
	
	public CarroProduct getCarro(){
		return carro;
	}
	
	
	
	
	
	

}
