package com.crm.utils;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {

	public static WebDriver wd = null;
	public static Random random = new Random();

	public static void clickButton(String identifiedby, WebDriver wd, String locator) {
		if (identifiedby.equalsIgnoreCase("id")) {
			wd.findElement(By.id(locator)).click();
		} else if (identifiedby.equalsIgnoreCase("name")) {
			wd.findElement(By.name(locator)).click();
		} else if (identifiedby.equalsIgnoreCase("css")) {
			wd.findElement(By.cssSelector(locator)).click();

		} else if (identifiedby.equalsIgnoreCase("xpath")) {
			wd.findElement(By.xpath(locator)).click();
		}
	}

	public static void insertText(String identifiedby, WebDriver wd, String locator, String value) {
		if (identifiedby.equalsIgnoreCase("id")) {
			wd.findElement(By.id(locator)).sendKeys(value);
		} else if (identifiedby.equalsIgnoreCase("name")) {
			wd.findElement(By.name(locator)).sendKeys(value);
		} else if (identifiedby.equalsIgnoreCase("css")) {
			wd.findElement(By.cssSelector(locator)).sendKeys(value);
		} else if (identifiedby.equalsIgnoreCase("xpath")) {
			wd.findElement(By.xpath(locator)).sendKeys(value);
		}
	}

	public static void clickLink(String identifiedby, WebDriver wd, String locator) {
		if (identifiedby.equalsIgnoreCase("id")) {
			wd.findElement(By.id(locator)).click();
		} else if (identifiedby.equalsIgnoreCase("name")) {
			wd.findElement(By.name(locator)).click();
		} else if (identifiedby.equalsIgnoreCase("css")) {
			wd.findElement(By.cssSelector(locator)).click();
		} else if (identifiedby.equalsIgnoreCase("xpath")) {
			wd.findElement(By.xpath(locator)).click();
		} else if (identifiedby.equalsIgnoreCase("link")) {
			wd.findElement(By.linkText(locator)).click();

		}

	}

	public static void selectDropdownItems(String identifiedby, WebDriver wd, String locator, String value,
			String itemType) {
		WebElement element = null;
		if (identifiedby.equalsIgnoreCase("id")) {
			element = wd.findElement(By.id(locator));
		} else if (identifiedby.equalsIgnoreCase("name")) {
			element = wd.findElement(By.name(locator));
		} else if (identifiedby.equalsIgnoreCase("css")) {
			element = wd.findElement(By.cssSelector(locator));

		} else if (identifiedby.equalsIgnoreCase("xpath")) {
			element = wd.findElement(By.xpath(locator));
		}

		Select selobj = new Select(element);
		if (itemType.equals("value")) {
			selobj.selectByValue(value);
		} else if (itemType.equals("text")) {
			selobj.selectByVisibleText(value);
		} else if (itemType.equals("index")) {
			selobj.selectByIndex(Integer.parseInt(value));

		}
	}

	public static void waitForElement(String identifiedby, WebDriver wd, String locator) {
		WebDriverWait wait = new WebDriverWait(wd, 50);
		if (identifiedby.equalsIgnoreCase("id")) {
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
		}
		if (identifiedby.equalsIgnoreCase("name")) {
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locator)));
		}
		if (identifiedby.equalsIgnoreCase("css")) {
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
		}
		if (identifiedby.equalsIgnoreCase("xpath")) {
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));

		}

	}

	public static void clickRadioButton(String identifiedby, WebDriver wd, String locator) {
		if (identifiedby.equalsIgnoreCase("id")) {
			wd.findElement(By.id(locator)).click();

		}
		if (identifiedby.equalsIgnoreCase("name")) {
			wd.findElement(By.name(locator)).click();

		}
		if (identifiedby.equalsIgnoreCase("css")) {
			wd.findElement(By.cssSelector(locator)).click();
		}
		if (identifiedby.equalsIgnoreCase("xpath")) {
			wd.findElement(By.xpath(locator)).click();

		}
	}

	public static boolean checkisTextPresent(String verifyText, WebDriver wd) {
		boolean isTextPresent = false;
		isTextPresent = wd.getPageSource().contains(verifyText);
		return isTextPresent;

	}

	public static void closeAlert(WebDriver wd) {
		if (wd.switchTo().alert() != null) {
			Alert alert = wd.switchTo().alert();
			alert.accept();

		}

	}

	public static void navigateForward(WebDriver wd) {
		wd.navigate().forward();
	}

	public static void navigateBackward(WebDriver wd) {
		wd.navigate().back();
	}

	public static void pageRefresh(WebDriver wd) {
		wd.navigate().refresh();
	}

	public static void scrollUp(WebDriver wd) {
		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("window.scrollTo(0, index)");
	}

	public static void scrollDown(WebDriver wd) {
		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("window.scrollTo(0, -index)");

	}

	public static String getText(String identifiedby, WebDriver wd, String locator) {
		if (identifiedby.equalsIgnoreCase("id")) {
			wd.findElement(By.id(locator)).getText();
		}
		if (identifiedby.equalsIgnoreCase("name")) {
			wd.findElement(By.name(locator)).getText();
		}
		if (identifiedby.equalsIgnoreCase("css")) {
			wd.findElement(By.cssSelector(locator)).getText();
		}
		if (identifiedby.equalsIgnoreCase("xpath")) {
			wd.findElement(By.xpath(locator)).getText();

		}
		return null;

	}

	public static void clearText(String identifiedby, WebDriver wd, String locator) {
		if (identifiedby.equalsIgnoreCase("id")) {
			wd.findElement(By.id(locator)).clear();
		}
		if (identifiedby.equalsIgnoreCase("name")) {
			wd.findElement(By.name(locator)).clear();
		}
		if (identifiedby.equalsIgnoreCase("css")) {
			wd.findElement(By.cssSelector(locator)).clear();
		}
		if (identifiedby.equalsIgnoreCase("xpath")) {
			wd.findElement(By.xpath(locator)).clear();
		}
	}

	public static boolean isElementPresent(String identifiedby, WebDriver wd, String locator) {
		WebElement element = null;
		boolean elementavailable = true;
		if (identifiedby.equalsIgnoreCase("id")) {
			try {
				element = wd.findElement(By.id(locator));
			} catch (Exception e) {
				elementavailable = false;
				e.printStackTrace();
			}
			return elementavailable;

		} else if (identifiedby.equalsIgnoreCase("css")) {
			try {
				element = wd.findElement(By.cssSelector(locator));
			} catch (Exception e) {
				elementavailable = false;
				e.printStackTrace();
			}
			return elementavailable;
		}
		return elementavailable;

	}

	public static long randomNumberGenerate(int length) {

		long maxNum = 1;
		for (int i = 0; i < length; i++) {
			maxNum = maxNum * 10;
		}

		String numbers = new String("0123456789"); // 9
		int n = numbers.length();
		Random r = new Random();

		String result = "" + "123456789".charAt(r.nextInt(9));

		for (int i = 1; i < length; i++)
			result += numbers.charAt(r.nextInt(n));

		long randomNumber = Long.parseLong(result);
		randomNumber = randomNumber < maxNum / 10 ? randomNumber + maxNum / 10 : randomNumber;

		return randomNumber;
	}
}
