package com.test.shareGarden.domain.product.measureUnit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasureUnitRepository extends JpaRepository<MeasureUnit, Integer> {
}