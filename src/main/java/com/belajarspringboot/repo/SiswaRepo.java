package com.belajarspringboot.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.belajarspringboot.entity.Siswa;

public interface SiswaRepo extends CrudRepository<Siswa, Long> {

    List<Siswa> findByNameContains(String name);

}
