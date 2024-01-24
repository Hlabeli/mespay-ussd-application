package com.mespay.persistence.repository;

import com.mespay.persistence.entity.NotifierEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INotifierRepository extends JpaRepository<NotifierEntity, Long> {
}
