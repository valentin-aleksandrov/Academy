package academy.areas.courses.repositories;

import academy.areas.courses.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Integer> {
    List<Course> findAllByActiveTrue();
    Course findCourseByIdAndActiveTrue(final Integer id);
}
