package com.belajarspringboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.belajarspringboot.entity.Siswa;
import com.belajarspringboot.repo.SiswaRepo;

@Service
@Transactional
public class SiswaService {

    @Autowired
    private SiswaRepo repo;

    public Iterable<Siswa> findAlList() {
        return repo.findAll();
    }

    public void addSiswa(Siswa siswa) {
        repo.save(siswa);
    }

    public void deleteById(long id) {
        repo.deleteById(id);
    }

    public Optional<Siswa> findByID(long id) {
        return repo.findById(id);
    }

    public void updateSiswa(Siswa siswa) {
        repo.save(siswa);
    }

    public List<Siswa> findByName(String keyword) {
        return repo.findByNameContains(keyword);
    }

}
