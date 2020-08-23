package com.zcy.dao;

import com.zcy.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompamyDao extends JpaRepository<Company, Long> {
}
