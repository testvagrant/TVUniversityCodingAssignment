package com.testvagrant.tvu.amazonshopping.drivers.wait;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.testvagrant.tvu.amazonshopping.annotations.WaitDuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits implements Provider<WebDriverWait> {
    private WebDriverWait webDriverWait;


    @Inject
    public Waits(WebDriver webDriver, @WaitDuration String waitDuration) {
        webDriverWait = new WebDriverWait(webDriver,Long.parseLong(waitDuration));
    }

    @Override
    public WebDriverWait get() {
        return webDriverWait;
    }
}
