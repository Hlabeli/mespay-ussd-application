package com.mespay.persistence.repository;

import com.mespay.persistence.entity.CustomerDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICustomerDetailsRepository extends JpaRepository<CustomerDetailsEntity, Long> {

    Optional<CustomerDetailsEntity> findByTelephone(String telephone);

    Optional<CustomerDetailsEntity> findByAccountDetails_AccountNumber(String accountNumber);

    Optional<CustomerDetailsEntity> findByEmail(String email);

}
