package co.com.automatizacion.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationUser {
    public static final Target CIUDAD = Target.the("Campo para Ciudad del usuario")
            .located(By.id("city"));
    public static final Target CODIGO_POSTAL = Target.the("Campo para Código postal del usuario")
            .located(By.id("zip"));
    public static final Target CONTENEDOR_PAIS = Target.the("Contenedor de los paises")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target PAIS = Target.the("Campo para el País del usuario")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BOTON_DEVICES = Target.the("Botón para ir a Devices")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
