import br.com.dio.challenge.domain.Content;
import br.com.dio.challenge.domain.Course;
import br.com.dio.challenge.domain.Mentoring;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Course course1 = new Course(); //object instance
        course1.setTitle("Java Course");
        course1.setDescription("Java Course Description");
        course1.setWorkload(8);

        Course course2 = new Course(); //object instance
        course2.setTitle("JS Course");
        course2.setDescription("JS Course Description");
        course2.setWorkload(4);

        Content content = new Course();
        Content content1 = new Mentoring();

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Java mentoring");
        mentoring.setDescription("Java Description Mentoring");
        mentoring.setDate(LocalDate.now());

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentoring);

    }
}
