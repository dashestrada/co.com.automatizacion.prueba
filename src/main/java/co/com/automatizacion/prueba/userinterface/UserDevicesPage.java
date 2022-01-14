package co.com.automatizacion.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserDevicesPage {

    public static final Target CONTENEDOR_COMPUTADOR = Target.the("Contenedor para Computador")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target COMPUTADOR  = Target.the("Campo para Computador")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/input[1]"));
    public static final Target CONTENEDOR_VERSION= Target.the("Contenedor para Versión")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[1]/span"));
    public static final Target VERSION= Target.the("Campo para Versión")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/input[1]"));
    public static final Target CONTENEDOR_LENGUAJE  = Target.the("Contenedor para Lenguaje")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/div[1]/span"));
    public static final Target LENGUAJE= Target.the("Campo para Lenguaje")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/input[1]"));
    public static final Target CONTENEDOR_DISPOSITIVOS_MOVILES  = Target.the("Contenedor para Dispositivos Móvil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span"));
    public static final Target DISPOSITIVOS_MOVILES= Target.the("Campo para dispositivo Móvil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));
    public static final Target CONTENEDOR_MODELO_DISPOSITIVO  = Target.the("Contenedor para modelo del dispositivo Móvil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div"));
    public static final Target MODELO_DISPOSITIVO= Target.the("Campo para el módelo del dispositivo móvil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));
    public static final Target CONTENEDOR_SISTEMA_OPERATIVO  = Target.the("Contenedor para el SO del dispositivo Móvil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div"));
    public static final Target SISTEMA_OPERATIVO= Target.the("Campo para el SO del dispositivo móvil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));
    public static final Target ULTIMO_PASO= Target.the("Botón para finalizar")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a"));




}

