package com.sca.bookmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sca.bookmicroservice.entity.Story;

@Repository
public interface StoryRepository extends JpaRepository<Story, String> {
}