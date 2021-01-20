package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.CalculationService;

public class Program {
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		String path = "E:\\WorkSpace\\Udemy\\Java COMPLETO 2020 POO + Projetos\\eclipse-workspace\\Generics2\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] vect = line.split(",");
				list.add(new Product(vect[0], Double.parseDouble(vect[1])));
				line = br.readLine();
			}

			Product x = CalculationService.max(list);
			System.out.println("Produto mais caro:");
			System.out.println(x);
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
