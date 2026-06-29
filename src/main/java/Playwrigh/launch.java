package Playwrigh;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  
		Page page=browser.newPage();
		page.navigate("https://letcode.in/edit");
		String Pgtitle=page.title();
		System.out.println("page title "+Pgtitle);
		page.close();
		//browser.close();
		//playwright.close();
		
	}

}
