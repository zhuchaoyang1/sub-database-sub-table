package com.zcy.dao;

import com.zcy.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompamyDao extends JpaRepository<Company, Long> {
}
