package cifer.com.designmodel.工厂模式;

/**
 * Created by cifer on 2018/6/15 11:49.
 */
public class Factory {
    public static FactoryInterface newClass(String key){
          FactoryInterface anInterface = null;
          switch (key){
              case "one":
                anInterface = new Methodone();
                  break;
              case "two":
                  anInterface = new Methodtwo();
                  break;
          }
        return anInterface;
    }

}
