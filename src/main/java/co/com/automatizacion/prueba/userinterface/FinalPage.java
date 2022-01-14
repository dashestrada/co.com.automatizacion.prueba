package co.com.automatizacion.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinalPage {

    public static final Target CONTRASENA = Target.the("Campo para ingresar la Contraseña")
            .located(By.id("password"));
    public static final Target CONFIRMAR_CONTRASENA = Target.the("Campo para Confirmar la Contraseña")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_STAY_INFORMED  = Target.the("Checkbox para mantenerse informado")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECKBOX_TERMS  = Target.the("Checkbox para terminos de uso de Utest")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKBOX_PRIVACY  = Target.the("Checkbox para  Privacidad")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BOTON_COMPLETADO  = Target.the("Botón para  Completar")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));




}
