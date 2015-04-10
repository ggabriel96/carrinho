import java.util.*;

class Carrinho{
	ArrayList<Produto> prod = new ArrayList<Produto>();
	
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
		return resp;
	}
	
	
	
}
