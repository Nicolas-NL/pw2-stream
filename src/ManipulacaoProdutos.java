import java.util.List;
import java.util.Optional;
public class ManipulacaoProdutos {
      public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.setId(1);
		p1.setNome("Suco");
		p1.setCategoria(CategoriaEnum.BEBIDA);
		p1.setPreco(1100);
		Produto p2 = new Produto();
		p2.setId(2);
		p2.setNome("Refrigerante");
		p2.setCategoria(CategoriaEnum.BEBIDA);
		p2.setPreco(1200);
		Produto p3 = new Produto();
		p3.setId(3);
		p3.setNome("Pão");
		p3.setCategoria(CategoriaEnum.PADARIA);
		p3.setPreco(1300);
		Produto p4 = new Produto();
		p4.setId(4);
		p4.setNome("Banana");
		p4.setCategoria(CategoriaEnum.HORTIFRUTI);
		p4.setPreco(1400);
		Produto p5 = new Produto();
		p5.setId(5);
		p5.setNome("Sabonete");
		p5.setCategoria(CategoriaEnum.HIGIENE);
		p5.setPreco(1500);
		
		Optional<Produto> Maior =
		lista.stream().filter(e -> e.getPreco() >50()).
		findFirst();

		System.out.println("Nome: "+ e.getNome());
	}
}
