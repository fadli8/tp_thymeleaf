package com.example.hospitaltp;

import com.example.hospitaltp.entitie.Patient;
import com.example.hospitaltp.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalTpApplication implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;
	public static void main(String[] args) {

		SpringApplication.run(HospitalTpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
       
		Stream.of("ayman", "ahmed", "amin")
				.forEach(name -> {
					Patient patient = new Patient();
					patient.setNom(name);
					patient.setDateNaissance(new Date());
					patient.setMalade(Math.random() > 0.5 ? false : true);
					patient.setScore(Math.random() > 0.5 ? 50 : 70);
					patientRepository.save(patient);

				});
	}
}
