package com.suraj.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.suraj.placement.entity.placementDetail;

@Repository
public interface StudentRepository extends JpaRepository <placementDetail,Integer> {

}
