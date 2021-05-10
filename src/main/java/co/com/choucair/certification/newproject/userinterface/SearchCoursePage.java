package co.com.choucair.certification.newproject.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selecciona la universidad choucair")
            .located(By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso")
            .located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Resultado de buscar el curso")
            .located(By.xpath("//a[contains(text(),'Foundation Express')]"));

    public static final Target NAME_COURSE = Target.the("Nombre del curso")
            .located(By.xpath("//a[contains(text(),'Foundation Express')]"));
}