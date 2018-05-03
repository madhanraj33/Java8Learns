package mad.learn.java8;

import java.util.Arrays;
import java.util.Collection;

import mad.learn.model.Patients;

public class PatientSummary {

	public static void main(String[] args) {

		Collection<Patients> patientsList = Arrays.asList(new Patients(1, 18, "Madhanraj", "Chennai", "9176750511"),
				new Patients(1, 24, "Praveena", "Poonamalle", "9176750511"),
				new Patients(1, 28, "Sree", "Avadi", "9176750511"),
				new Patients(1, 32, "Muthu", "Ambattur", "9176750511"),
				new Patients(1, 36, "Pramodhitha", "USA", "9176750511"));
		
		//patientsList.stream().filter(patients -> patients.getAge() > 28).forEach(patients -> {patients.setId(2); System.out.println(patients.getId());});
		//patientsList.forEach(s->System.out.println(s.getId()));
		
		//patientsList.stream().filter(patients -> patients.getAge() > 28).
		patientsList.removeIf(patients -> patients.getAge()>=28);
		
		
//		System.out
//				.println(patientsList.stream().filter(patients -> patients.getAge() > 28).collect(Collectors.toList()));
	}

}
