class Carrinho{
	ArrayList<Produto> prod = new ArrayList<Produto>;

	public double calculaPeso(Produto P){
		double peso = 0.0;
		for(int i = 0; i < prod.length; i++) peso += prod[i].getPeso;
		return peso;
	}

	public double calculaFrete(double a, double b){
		return a * calculaPeso();
	}	

	public double calculaPreço(Produto P){
		double preço = 0.0;
		for(int i = 0; i < prod.length; i++) preço += prod[i].getPreço;
		return preço;
	}	
	
}
