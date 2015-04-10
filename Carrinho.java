import java.util.*;

class Carrinho{
	ArrayList<Produto> prod = new ArrayList<Produto>();

	public double calculaPeso(Produto P){
		double peso = 0.0;
		for(int i = 0; i < prod.size(); i++) {
			//System.out.println("peso: " + prod.get(i).getPeso());
			peso += prod.get(i).getPeso();
		}
		return peso;
	}

	public double calculaFrete(double a, double b){
		Produto p = null;
		if (prod.size() < 1) return 0;
		return (a * calculaPeso(p)) + (2 * b);
	}	

	public double calculaPreço(Produto P){
		double preço = 0.0;
		for(int i = 0; i < prod.size(); i++) preço += prod.get(i).getPreço();
		return preço;
	}	

	public Produto adicionaProduto(Produto p){
		prod.add(p);
		return p;
	}
	
	public void removeProduto(Produto p){
		prod.remove(p);
	}
	
	public double preçototal(double a, double b){
		int i;
		double resp = 0;
		for(i = 0; i < prod.size(); i++){
			resp += prod.get(i).getPreço();
		}
		return resp + calculaFrete(a, b);
	}
	
}
