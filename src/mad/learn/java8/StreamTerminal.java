package mad.learn.java8;

import java.util.Arrays;
import java.util.List;

import mad.learn.model.Candidates;

public class StreamTerminal {

	public static void main(String[] args) {

		List<Candidates> candidatesList = Arrays.asList(new Candidates("Madhan", "local", 25),
				new Candidates("Muthu", "local", 21), new Candidates("Raj", "local", 30),
				new Candidates("Praveena", "local", 55), new Candidates("Sree", "local", 22),
				new Candidates("Pramodhitha", "local", 26));

		// to find if all the candidates are locals
		System.out.println(candidatesList.stream().allMatch(candidate -> candidate.getNatives().equals("local")));

		//to find least age 
		System.out.println(candidatesList.stream()
				.min((canditate1, candidate2) -> Integer.compare(canditate1.getAge(), candidate2.getAge())).get().getName());

	}

}
