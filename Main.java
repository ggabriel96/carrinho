import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dist, pesoAnt, preçoAnt;
		final int QTD = 4;
		final double FRETE = 20.0;
		Carrinho c = new Carrinho();
		Produto p = null;
		
		for (int i = 1; i <= QTD; i++) {
			p = new Produto();
			
			System.out.println();
			
			System.out.println("Nome do produto " + i + ":");
			p.setNome(sc.nextLine());
			
			System.out.println("Peso do produto " + i + ":");
			p.setPeso(sc.nextDouble());
			sc.nextLine();
			
			System.out.println("Preço do produto " + i + ":");
			p.setPreço(sc.nextDouble());
			sc.nextLine();
			
			c.adicionaProduto(p);
		}
		
		System.out.println();
		System.out.println("Qual a distância:");
		dist = sc.nextDouble();
		
		System.out.println("Frete: " + c.calculaFrete(FRETE, dist));
		pesoAnt = c.calculaPeso(p);
		preçoAnt = c.preçototal(FRETE, dist);
		
		for (int i = 0; i < QTD; i++) {
			c.removeProduto(c.prod.get(0));
		}
		
		System.out.println();
		System.out.println("Peso total: " + pesoAnt);
		System.out.println("Preço total: " + preçoAnt);
	}
}
