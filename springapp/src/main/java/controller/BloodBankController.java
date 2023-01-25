package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

import dao.IBloodBank;
import dao.IBloodDonor;
import model.BloodBank;
import model.BloodDonor;

@RestController
public class BloodBankController {

	@Autowired
	IBloodBank bank;
	
	@Autowired
	IBloodDonor donor;

	// Get All Sample
	@GetMapping("/sample")
	public List<BloodBank> viewAllSample() {
		return bank.findAll();
	}

	// Add Sample
	@PostMapping("/admin/addSample")
	public String addSample(@RequestBody BloodBank b) {
		bank.save(b);
		return "Sample Added";
	}

	// Delete Sample
	@DeleteMapping("/admin/sample/{id}")
	public String deleteSample(@PathVariable("id") String bloodBankID) {
		bank.deleteById(bloodBankID);
		return "Sample Deleted";
	}

	// Update Sample
	@PutMapping("/admin/sample/{id}")
	public String updateSample(@RequestBody BloodBank b, @PathVariable("id") String bloodBankID) {
		bank.findById(b.getBloodBankID()).map(update -> {
			update.setBloodGroup(b.getBloodGroup());
			update.setBloodPressure(b.getBloodPressure());
			update.setPhLevel(b.getPhLevel());
			update.setQuantity(b.getQuantity());
			return bank.save(update);
		});
		return "Sample Updated";
	}
	
	// Get All Donor	
	@GetMapping("/admin/donor")
	public List<BloodDonor> viewAllDonor() {
		return donor.findAll();
	}
	
	//Update Donor
	@PutMapping("/admin/donor/{id}")
	public String updateDonor(@RequestBody BloodDonor b, @PathVariable("id") String id) {
		donor.findById(b.getId()).map(update -> {
			update.setDonorEmail(b.getDonorEmail());
			update.setBloodGroup(b.getBloodGroup());
			update.setPhLevel(b.getPhLevel());
			update.setBloodPressure(b.getBloodPressure());
			update.setActive(b.isActive());
			return donor.save(update);
		});
		return "Donor Updated";
	}
	
	//Delete Donor
	@DeleteMapping("/admin/donor/{id}")
	public String deletedonor(@PathVariable("id") String id) {
		bank.deleteById(id);
		return "Donor Removed";
	}

}
