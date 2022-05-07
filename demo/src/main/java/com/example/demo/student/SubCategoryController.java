package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubCategoryController {

    private final SubCategoryService subCategoryService;

    @Autowired
    public SubCategoryController(SubCategoryService subCategoryService) {
        this.subCategoryService = subCategoryService;
    }



    @GetMapping("/subcategories")
    public List<SubCategory> getSubCategories() {
        return subCategoryService.getSubCategories();
    }


    @PostMapping("/addCategory")
    public void addSubCategory(@RequestBody SubCategory category) {
        subCategoryService.addSubCategory(category);
    }


}
