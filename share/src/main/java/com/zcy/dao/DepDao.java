package com.zcy.dao;

import com.zcy.entity.Dep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepDao extends JpaRepository<Dep, Long> {
}
