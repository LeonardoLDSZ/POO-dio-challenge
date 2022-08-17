import br.com.dio.challenge.domain.*;

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

//        System.out.println(course1);
//        System.out.println(course2);
//        System.out.println(mentoring);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Java Developer Bootcamp");
        bootcamp.setDescription("Java Developer Bootcamp Description");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring);

        Dev devCamila = new Dev();
        devCamila.setName("Camila");
        devCamila.subscribeBootcamp(bootcamp);
        System.out.println("Subscribed Contents Camila" + devCamila.getSubscribedContents());
        devCamila.progress();
        devCamila.progress();
        System.out.println("-");
        System.out.println("Subscribed Contents Camila" + devCamila.getSubscribedContents());
        System.out.println("Completed Contents Camila" + devCamila.getCompletedContents());
        System.out.println("XP: " + devCamila.calculateTotalXp());


        System.out.println("------------");
        Dev devJohn = new Dev();
        devJohn.setName("John");
        devJohn.subscribeBootcamp(bootcamp);
        System.out.println("Subscribed Contents John" + devJohn.getSubscribedContents());
        devJohn.progress();
        devJohn.progress();
        devJohn.progress();
        System.out.println("-");
        System.out.println("Subscribed Contents John" + devJohn.getSubscribedContents());
        System.out.println("Completed Contents John" + devJohn.getCompletedContents());
        System.out.println("XP: " + devJohn.calculateTotalXp());



    }
}
