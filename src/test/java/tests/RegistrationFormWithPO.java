package tests;

import Pages.RegistrationPages;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormWithPO {

    RegistrationPages registrationPages = new RegistrationPages();
    String firstName = "Anna";
    String lastName = "Rain";
    String email = "annatest111@gmail.com";
  //  String wrapper = "Female";
    String phone = "78889998877";
    String subject = "Arts";
  // String hobbyes = "Music";
 //   String file = "src/test/java/tests/khosiko5.jpg";
    String adress = "Address";
    String state = "NCR";
    String city = "Delhi";
  //  String fieldName = "Thanks for submitting the form";
  //  String value = "Thanks for submitting the form";

    @BeforeAll

    static  void beforeAll() {

        Configuration.baseUrl = "https://demoqa.com";


    }

    @Test

    void successFillTest (){



        registrationPages.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGenter()
                .setPhone(phone)
                .setBirthDate("14","January", "1984")
                .setSubjects(subject)
                .setHobbyes()
                .uploadUserFile()
                .setAdress(adress)
                .setState(state)
                .setCity(city)
                .setSubmit()
                .checkForm ("Student Name","Anna Rain");



    }
}
