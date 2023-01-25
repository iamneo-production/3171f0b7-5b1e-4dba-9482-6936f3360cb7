package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.BloodBank;

public interface IBloodBank extends JpaRepository<BloodBank, String> {

}

