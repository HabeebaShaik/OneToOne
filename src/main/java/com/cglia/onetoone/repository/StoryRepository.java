package com.cglia.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cglia.onetoone.model.Story;

@Repository
public interface StoryRepository extends JpaRepository<Story, Long>{

}
