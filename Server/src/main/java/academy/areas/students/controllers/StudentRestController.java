package academy.areas.students.controllers;

import academy.areas.students.entities.Student;
import academy.areas.students.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentRestController {
    private StudentService studentService;

    @Autowired
    public StudentRestController(final StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/allStudents")
    public List<Student> getStudents(){
        return this.studentService.getAllStudents();
    }
    @GetMapping("/findById/{id}")
    public Student getStudentById(@PathVariable final Integer id){
        return this.studentService.findStudentById(id);
    }






   //in progress






    @PostMapping("/saveStudent")
    public @ResponseBody int createStudent(@RequestBody Student student){
        this.studentService.addStudent(student);
        return 100;
    }
    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable final Integer id){

    }
}
