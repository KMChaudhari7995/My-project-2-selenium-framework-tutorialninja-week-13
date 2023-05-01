package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class ComponentPage extends Utility {

    By verifyComponents = By.xpath("//h2[contains(text(),'Components')]");


    public String getTextComponent(){

        return getTextFromElement(verifyComponents);
    }
}
