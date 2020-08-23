package com.zcy.dao;

import com.zcy.entity.Dep;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepDao extends JpaRepository<Dep, Long> {
}
