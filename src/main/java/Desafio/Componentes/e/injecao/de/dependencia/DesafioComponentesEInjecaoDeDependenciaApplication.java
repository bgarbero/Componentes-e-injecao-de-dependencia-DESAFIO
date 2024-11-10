package Desafio.Componentes.e.injecao.de.dependencia;

import Desafio.Componentes.e.injecao.de.dependencia.entities.Order;
import Desafio.Componentes.e.injecao.de.dependencia.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DesafioComponentesEInjecaoDeDependenciaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioComponentesEInjecaoDeDependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int orderCode = sc.nextInt();
		double basic = sc.nextDouble();
		double discount = sc.nextDouble();

		Order order = new Order(orderCode, basic, discount);

		System.out.printf("Pedido código %d%nValor total: %.2f", order.getOrder(), orderService.total(order));

		sc.close();
	}
}
