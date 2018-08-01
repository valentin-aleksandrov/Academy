package academy.areas.lessons.controllers;

import academy.areas.lessons.entities.Lesson;
import academy.areas.lessons.services.LessonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lessons")
public class LessonRestController {
    private LessonServices lessonServices;

    @Autowired
    public LessonRestController(final LessonServices lessonServices) {
        this.lessonServices = lessonServices;
    }

    @GetMapping("/getById/{id}")
    public Lesson getLesson(@PathVariable final Integer id){
        return null;
    }
    @GetMapping("/getAll")
    public List<Lesson> getAllLessons(){
        return null;
    }
    @PostMapping("/create")
    public @ResponseBody Integer createLesson(@RequestBody Lesson lesson){
        return null;
    }
    @PutMapping("/update")
    public void updateLesson(@RequestBody Lesson lesson){

    }
    @DeleteMapping("/delete/{id}")
    public void disableLesson(@PathVariable final Integer id){

    }
}
