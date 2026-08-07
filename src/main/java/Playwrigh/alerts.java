package Playwrigh;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright playwright=Playwright.create();
		//playwright.chromium().launch(new BrowserType.LaunchOptions()).setHeadless(false).newPage();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://letcode.in/alert");
		page.onDialog(dialog -> {
			System.out.println(dialog.message());
		//	dialog.dismiss();
			dialog.accept("RENU");
		});
		page.locator("#accept").click();


	}

}
