import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carrinho c = new Carrinho();
		Produto p = new Produto();
		
		System.out.println("Nome do produto 1:");
		p.setNome(sc.nextLine());
		System.out.println("Peso do produto 1:");
		p.setPeso(sc.nextDouble());
		System.out.println("Preço do produto 1:");
		p.setPreço(sc.nextDouble());
		c.adicionaProduto(p);
		
		System.out.println("Nome do produto 2:");
		p.setNome(sc.nextLine());
		System.out.println("Peso do produto 2:");
		p.setPeso(sc.nextDouble());
		System.out.println("Preço do produto 2:");
		p.setPreço(sc.nextDouble());
		c.adicionaProduto(p);
	}
}
