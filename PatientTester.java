package Hw03;

public class PatientTester {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PatientManager pm1 = new PatientManager();
			System.out.println(pm1);
			
		Patient patient1 = new Patient(1,200);
		Patient patient2 = new Patient(2,400);
		Patient patient3 = new Patient(3,600);
		Patient patient4 = new Patient(4,800);
		
		pm1.addPatient(patient1);
		pm1.addPatient(patient2);
		pm1.addPatient(patient3);
		pm1.addPatient(patient4);
		
		System.out.println(pm1);
		
		pm1.caffeineAbsorption();
		pm1.caffeineAbsorption();
		
		System.out.println(pm1);
		
		pm1.removePatient(3);
		
		System.out.println(pm1);
	}	
}
