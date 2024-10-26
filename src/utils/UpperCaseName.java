package utils;

import java.util.function.Function;

import entities.Client;

public class UpperCaseName implements Function<Client, String> {

	@Override
	public String apply(Client client) {
		return client.getName().toUpperCase();
	}
}