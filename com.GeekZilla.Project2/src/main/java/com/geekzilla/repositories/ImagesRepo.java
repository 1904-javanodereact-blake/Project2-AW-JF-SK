package com.geekzilla.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekzilla.model.Images;

@Repository
public interface ImagesRepo extends JpaRepository<Images, Integer> {

	Images findByImgId(int imgid);
}
