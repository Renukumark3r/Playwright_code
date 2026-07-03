package Playwrigh;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class interact_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  
		Page page=browser.newPage();
		page.navigate("https://letcode.in/edit");
		String Pgtitle=page.title();
		System.out.println("page title "+Pgtitle);
		page.fill("#fullName", "Renu");
		Locator locater=page.locator("#join");
		locater.press("End");
		locater.type("  man renu");
		locater.press("Tab");
		String Attribute=page.locator("id=getMe").getAttribute("Value");
		System.out.println(Attribute);
		page.locator("//input[@id='clearMe']").clear();
		//page.close();
		//browser.close();
		//playwright.close();
		
	}

}
