package PageObj;
import driver.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class PaginaSuportePendentesAberto {
	
	
	private WebElement labelProduto;
	
	

	public PaginaSuportePendentesAberto() {
		
		labelProduto = Driver.getDriver().findElement(By.xpath("//form[@id='formMostraSuporte']/fieldset/fieldset/div/label"));
		
				
	}



	public WebElement getLabelProduto() {
		return labelProduto;
	}



	public void setLabelProduto(WebElement labelProduto) {
		this.labelProduto = labelProduto;
	}




	
	

}
