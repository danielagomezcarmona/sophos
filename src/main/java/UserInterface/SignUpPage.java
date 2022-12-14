package UserInterface;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class SignUpPage {
    public static final Target FIRSTNAME = Target
            .the("Nombre").located(By.id("firstName"));
    public static final Target LASTNAME = Target
            .the("Apellido").located(By.id("lastName"));
    public static final Target EMAIL = Target
            .the("Correo").located(By.id("userEmail"));
    public static final Target AGE = Target
            .the("Edad").located(By.id("age"));
    public static final Target SALARY = Target
            .the("Salario").located(By.id("salary"));
    public static final Target DEPARTMENT = Target
            .the("Departamento").located(By.id("department"));
    public static final Target ClickSubmit = Target
            .the("Click en submit").located(By.xpath("//button[@id='submit']"));

}
