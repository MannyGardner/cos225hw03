package Hw03;

public class PatientManager {
	public Patient patientArray[];

	public PatientManager() {
		patientArray = new Patient[10];
	}
	
	public int addPatient (Patient patient) {
		for(int i = 0; i < patientArray.length; i++) {
			if (patientArray[i] == null){
				patientArray[i] = patient;
				return i;
			}
		}
		return -1;
	}

	public Patient removePatient(int spot) {
		for(int i=0; i < patientArray.length; i++) {
			if(patientArray[i] != null) {
				if(patientArray[i] == patientArray[spot]) {
					Patient patientGone = patientArray[i];
					patientArray[i] = null;
					return patientGone;
					}
			}
		}
		return null;
	}
	
	public Patient caffeineAbsorption() {
		for(int i = 0; i < patientArray.length; i++) {
			if(patientArray[i] != null) {
				patientArray[i].cafMg -= 160;
				if(patientArray[i].cafMg < 0) {
					removePatient(i);
				}
			}
		}
	return null;
	}
	
	
	
	
	@Override
	public String toString() {
		for(int i = 0; i < patientArray.length; i++){
			if(patientArray[i] != null) {
			String patientStats = "Patient ID: " + patientArray[i].idNum + " Caffeine Level: " + patientArray[i].cafMg + "\n";
			System.out.println(patientStats);
			}
		}
		 return "empty";
	}
}
