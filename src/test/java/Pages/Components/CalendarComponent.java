package Pages.Components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    public void setDate (String day,String month, String year) {

        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption(year);
        $("[aria-label$='January 14th, 1984']").click();
       // $("[aria-label$='" + month + " " + day + "th," + year + "']").click();

    }
}
