package entities;

import java.util.Objects;

public class Client {

	private String name;
	private Integer age;
	
	public Client() {
	}
	
	public Client(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public static String staticUpperCaseName(Client client) {
		return client.getName().toUpperCase();
	}
	
	public String nonStaticUpperCaseName() {
		return name.toUpperCase();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(age, other.age) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", age=" + age + "]";
	}

}