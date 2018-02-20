package com.defangit.girl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoyRepository extends JpaRepository<Boy,Integer> {
    public List<Boy> findByAgeAfter(Integer age);
    public List<Boy> findBoyByAge(Integer age);
    public List<Boy> findByGenderAndAge();

}
