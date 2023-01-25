package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;

import dao.IBloodDonor;
import model.BloodDonor;

@RestController
public class BloodDonorController {

	@Autowired
	IBloodDonor donor;

	// Get All Donor
	@GetMapping("/donor")
	public List<BloodDonor> viewAllDonor() {
		return donor.findAll();
	}

	// Get particular Donor
	
	@GetMapping("/donor/{id}")
	public String searchParticularDonor(@PathVariable("id") String id) {
		return donor.findById(id).get().getDonorEmail();
	}
}
