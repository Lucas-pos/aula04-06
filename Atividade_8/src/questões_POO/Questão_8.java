package questões_POO;

import java.util.HashMap;

public class Questão_8 {

	public static void main(String[] args) {

		HashMap<String, String> contato_tel = new HashMap<>();

		contato_tel.put("jozeca", "839 9617-4615");
		contato_tel.put("lukita", "839 9512-1245");

		String tel = contato_tel.get("jozeca");

		System.out.println("Este é o telefone de jose: " + tel);

		String num = contato_tel.remove("lukita");

		System.out.println("O número removido foi: " + num);

	}
}