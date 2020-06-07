var webdriver = require('selenium-webdriver');
var chrome = require("selenium-webdriver/chrome");

const {Builder, By, Key, until} = require('selenium-webdriver');
var accounts = ["aasejone@gmail.com","bluecje@gmail.com","covsetel@gmail.com","benzenxiao@gmail.com","airmoc388@gmail.com", "almonddwee@gmail.com"]
async function fakeView(){
		for(var i = 0 ; i < accounts.length; i++ ){
			run(i);
		}
}

async function run(i){
	console.log(accounts[i]);
	var options = new chrome.Options();
	options.setUserPreferences({'profile.default_content_setting_values.notifications': 2});
	var driver = new webdriver.Builder().forBrowser('chrome').setChromeOptions(options).build();
	await driver.get('https://www.facebook.com/');
	await driver.findElement(By.id('email')).sendKeys(accounts[i]);
	await driver.findElement(By.id('pass')).sendKeys("fakeviewtest2020");
	await driver.findElement(By.id('loginbutton')).click();
	await driver.sleep(5000);
	console.log("navigating")
	await driver.navigate().to('https://www.facebook.com/218249898976940/videos/706261100204789/');
	console.log(driver.findElement(By.tagName('video')));
	while(true){
			
		}
}

fakeView();