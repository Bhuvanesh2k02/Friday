package bhuvanesh.Automation;

public class Locator {

	public static void main(String[] args) {
		
	//LinkText & PartialLinkText
		/*LinkText-> it have to things like LinkText & InnerText
		 * LinkText-> it have "<a"(AnchorTag name) and "href"(attribute) it's called as linkText
		 * InnerText-> it have some other TagName and Attribute means it's called as InnerText like "<t"
		 * LinkText-> it will perform "click()" action
		 * PartialLinkText-> it will pass portion of text. for Ex:Tablets to "Tab"
		 * The most preferable thing is "LinkeText" only because it will matches to multiple things
		*/
		
//cssSelector:	
	//Tag id-> "tag#idvalue"
		//driver.findElement(By.cssSelector("input#identify_email"));
		//driver.findElement(By.cssSelector("#identify_email"));
		//driver.findElement(By.cssSelector("*#identify_email"));
	//Tag class-> "tag.classnamevalue"
		//driver.findElement(By.cssSelector("tag.classnamevalue"));
		//driver.findElement(By.cssSelector(".classnamevalue"));
		//driver.findElement(By.cssSelector("*.classnamevalue"));
		
	//Tag attribute-> "tag[any attribute='value']"
		//driver.findElement(BY.cssselector("tagname[any attribute(unchangeable)='value']"));
		//driver.findElement(By.cssSelector("[any attribute='value']"));
		//driver.findElement(By.cssSelector("*[any attribute='value']"));
			
	//Tag class attribute-> "tag.class[attribute='value']"
		//driver.findElement(By.cssSelector("tagname.classname[attribute='value']");
		//driver.findElement(By.cssSelector(".classname[attribute='value']");
		//driver.findElement(By.cssSelector("*.classname[attribute='value']");
		
//Relative xpath:
    //single xpath:
		//driver.findElement(By.xpath("//tag[@any attribute='value']"));
			
	//multiple xpath:
		//driver.findElement(By.xpath("//tag[@any attribute='value'][@any attribute='value']"));
		//driver.findElement(By.xpath("//*[@id='email'][@placeholder='Email address or phone number'][@name='email']");
	//'and' & 'or' xpath:
		//driver.findElement(By.xpath("//tag[@any attribute='value' or @any attribute='value']"));
		//driver.findElement(By.xpath("//tag[@any attribute='value' and @any attribute='value']"));

		
		
	}
	
}
