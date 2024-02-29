package com.example.security.grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grades")
public class GradeController {

    @Autowired
    private GradeRepository gradeRepository;

    @GetMapping
    public List<Grade> getAllGrades() {
        return gradeRepository.findAll();
    }

    @PostMapping
    public Grade createGrade(@RequestBody Grade grade) {
        return gradeRepository.save(grade);
    }

    @GetMapping("/{id}")
    public Grade getGradeById(@PathVariable Long id) {
        return gradeRepository.findById(id).orElseThrow(() -> new RuntimeException("Grade not found"));
    }

    @PutMapping("/{id}")
    public Grade updateGrade(@PathVariable Long id, @RequestBody Grade gradeDetails) {
        Grade grade = gradeRepository.findById(id).orElseThrow(() -> new RuntimeException("Grade not found"));
        grade.setValue(gradeDetails.getValue());
        return gradeRepository.save(grade);
    }

    @DeleteMapping("/{id}")
    public void deleteGrade(@PathVariable Long id) {
        gradeRepository.deleteById(id);
    }
}