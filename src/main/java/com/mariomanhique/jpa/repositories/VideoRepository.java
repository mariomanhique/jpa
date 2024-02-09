package com.mariomanhique.jpa.repositories;

import com.mariomanhique.jpa.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer> {

}
