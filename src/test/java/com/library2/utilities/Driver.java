package com.library2.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /** 1. Creating a private constructor, we are closing access to the object of this class from outside the class */
        private Driver() {    }

    /** 2. Creating private InheritableThreadLocal<WebDriver> driverPool, to close access from outside this class */
    //Make it static, to use it in static method
        private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    /** 3. Re-usable utility method which will return same driverPool instance when we call it */
        public static WebDriver getDriver() {
            if (driverPool.get() == null) {

                String browserType = ConfigurationReader.getProperty("browser");

                    switch (browserType) {
                        case "chrome":
                            WebDriverManager.chromedriver().setup();
                            driverPool.set(new ChromeDriver());
                            driverPool.get().manage().window().maximize();
                            driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                            break;
                        case "firefox":
                            WebDriverManager.firefoxdriver().setup();
                            driverPool.set(new FirefoxDriver());
                            driverPool.get().manage().window().maximize();
                            driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                            break;
                        case "opera":
                            WebDriverManager.operadriver().setup();
                            driverPool.set(new OperaDriver());
                            driverPool.get().manage().window().maximize();
                            driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                            break;
                        case "edge":
                            WebDriverManager.edgedriver().setup();
                            driverPool.set(new EdgeDriver());
                            driverPool.get().manage().window().maximize();
                            driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                            break;
                        case "safari":
                            WebDriverManager.safaridriver().setup();
                            driverPool.set(new SafariDriver());
                            driverPool.get().manage().window().maximize();
                            driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                            break;

                    }
            }

            return driverPool.get();

        }

    /** 4. Re-usable utility method which will make sure our driver value is always null after using quit() method */
        public static void closeDriver(){
            if(driverPool.get() != null){
                driverPool.get().quit(); // this line will terminate the existing driver session. with using this driver will not be even null
                driverPool.remove();
            }

        }



}
