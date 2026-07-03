package Playwrigh;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  
		Page page=browser.newPage();
		page.navigate("https://www.testmuai.com/selenium-playground/simple-form-demo/");
	    page.fill("//input[@id='user-message']", "renu");
	    page.locator("//button[@id='showInput']").click();
	 String message=  page.locator("#message").innerText();
	  System.out.println(message);
		page.fill("#sum1", "88");
		page.fill("#sum2", "72");
		page.locator("text=Get Sum").click();
		String add=page.locator("#addmessage").innerText();
		System.out.println(add);
	}

}
