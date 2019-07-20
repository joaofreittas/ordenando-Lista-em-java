package br.home.testes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
public class Main {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		Date data1 = formato.parse("24/12/2019");
		Date data2 = formato.parse("29/12/2019");
		Date data3 = formato.parse("30/12/2019");
		Date data4 = formato.parse("25/12/2019");
		Date data5 = formato.parse("23/12/2019");
		Date data6 = formato.parse("06/12/2019");
		
		pessoas.add(new Pessoa("João", 1000, data1));
		pessoas.add(new Pessoa("Maria", 2000, data2));
		pessoas.add(new Pessoa("Pedro", 3000, data3));
		pessoas.add(new Pessoa("Carla", 4000, data4));
		pessoas.add(new Pessoa("Lucas", 5000, data5));
		pessoas.add(new Pessoa("Marcos", 6000, data6));
		Collections.sort(pessoas);
		
		for(Pessoa pessoa: pessoas) {
			System.out.println(pessoa.toString());
		}
	}

}
