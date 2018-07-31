/**
 * 单列模式：保证一个类只有一个实例，提供一个全局的访问点
 *   用例：Android-Universal-Image-Loader
 **/

public class Singleton{

    private static volatile Singleton instance = null;

    private Singleton();

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton()
                }
            }
        }
        return instance
    }
}