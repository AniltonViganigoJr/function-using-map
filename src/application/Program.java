package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		List<Client> clients = new ArrayList<>();
		
		clients.add(new Client("João", 36));
		clients.add(new Client("Moacyr", 70));
		clients.add(new Client("Tião", 46));
		clients.add(new Client("Thiago", 16));
		clients.add(new Client("Rodrigo", 26));
		clients.add(new Client("Paulo", 17));
		clients.add(new Client("Roberto", 18));
		clients.add(new Client("Pedro", 36));
		
		List<String> names = clients.stream().map(Client::nonStaticUpperCaseName).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
	}
}