package clases;

/* Clase Abstracta Para Que No Se Pueda Instanciar Directamente, Solo Las Clases Hijas Que Hereden De Esta Clase */
public abstract class SmartDevice {
    // 1. Atributos.

    boolean isAndroid;
    boolean isIos;
    // 2. Contructores.
    double version;
    public SmartDevice(){

    }

    public SmartDevice(boolean isAndroid, boolean isIos){
        this.isAndroid = isAndroid;
        this.isIos = isIos;
    }
    // 3. Métodos.
    public void upgrade(double versionToUpgrade){
        this.version = versionToUpgrade;
    }
}
