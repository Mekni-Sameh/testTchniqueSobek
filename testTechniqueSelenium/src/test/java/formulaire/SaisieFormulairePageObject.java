package formulaire;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SaisieFormulairePageObject {
	
	//Identification des ID (pour le dernier element j'ai utilisé le xpath car  pas de Id dispo)
	final static String Nom = "nom";
	final static String PRENOM = "prenom";
	final static String VILLE = "ville";
	final static String MAIL= "email";
	final static String TELEPHONE= "tel";
	final static String ENVOYER= "//div[@id='destination-form']/div[6]/button";
	final static String MESSAGE_CONFIRMATION= "modal-content";
	final static String MESSAGE_FORM_KO= "myModal";
	
	
	
	//Identification des WebElement 
	@FindBy(how = How.ID, using = Nom)
	public static WebElement nom;
	
	@FindBy(how = How.ID, using = PRENOM)
	public static WebElement Prenom;
	
	@FindBy(how = How.ID, using = VILLE)
	public static WebElement ville;
	
	@FindBy(how = How.ID, using = MAIL)
	public static WebElement mail;
	
	@FindBy(how = How.ID, using = TELEPHONE)
	public static WebElement tel;
	
	@FindBy(how = How.XPATH, using = ENVOYER)
	public static WebElement envoyerbtn;
	
	@FindBy(how = How.ID, using = MESSAGE_CONFIRMATION)
	public static WebElement messConf;
	
	@FindBy(how = How.ID, using = MESSAGE_FORM_KO)
	public static WebElement messErreur;
	
	//Creation des methodes 
	public void saisieNom(String monnom) {
		nom.sendKeys(monnom);
		
	}
public void saisiePrenom(String monPrenom) {
		
	Prenom.sendKeys(monPrenom);	
	}
public void saisieVille(String maVille) {
	ville.sendKeys(maVille);
}

public void saisieMail(String monEmail) {
	mail.sendKeys(monEmail);
	
}
public void saisieTel(String monTel) {
	
	tel.sendKeys(monTel);
}

public void envoyerformulaire() {
	
	envoyerbtn.click();
}
public String retounerFormulaireConfOK() {
	return messConf.getText();
	
}
public String retounerErreurFormulaire() {
	return messErreur.getText();
}
}
