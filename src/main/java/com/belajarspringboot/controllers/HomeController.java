package com.belajarspringboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.belajarspringboot.dto.SearchFormData;
import com.belajarspringboot.entity.Siswa;
import com.belajarspringboot.service.SiswaService;

@Controller
@RequestMapping("")
public class HomeController {

    @Autowired
    private SiswaService siswaService;

    @GetMapping("/")
    public String welcome(Model model) {
        model.addAttribute("searchForm", new SearchFormData());
        model.addAttribute("siswa", siswaService.findAlList());
        return "index";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("siswa", new Siswa());
        return "add";
    }

    @PostMapping("/save")
    public String save(Siswa siswa, Model model) {
        siswaService.addSiswa(siswa);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        siswaService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String delete(@PathVariable("id") Long id, Model model) {
        model.addAttribute("siswa", siswaService.findByID(id));
        return "edit";
    }

    @PostMapping("/update")
    public String update(Siswa siswa, Model model) {
        siswaService.updateSiswa(siswa);
        return "redirect:/";
    }

    @PostMapping("/search")
    public String search(SearchFormData searchFormData, Model model) {
        model.addAttribute("searchForm", searchFormData);
        model.addAttribute("siswa",
                siswaService.findByName(searchFormData.getKeyword()));
        return "index";
    }

}