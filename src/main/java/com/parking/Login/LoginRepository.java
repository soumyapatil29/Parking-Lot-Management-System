package com.parking.Login;

import org.springframework.data.repository.Repository;

public interface LoginRepository extends Repository<Login, Long> {

	public Login findAllByloginId(String admin);
}
