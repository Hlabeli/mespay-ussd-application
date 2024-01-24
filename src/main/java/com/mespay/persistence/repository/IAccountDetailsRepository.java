package com.mespay.persistence.repository;

import com.mespay.persistence.entity.AccountDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IAccountDetailsRepository extends JpaRepository<AccountDetailsEntity, Long> {
    public Optional<AccountDetailsEntity> findByAccountNumber(String accountNo);
}
