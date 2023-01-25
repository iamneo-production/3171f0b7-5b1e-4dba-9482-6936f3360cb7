package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.BloodDonor;

public interface IBloodDonor extends JpaRepository<BloodDonor, String> {

}
