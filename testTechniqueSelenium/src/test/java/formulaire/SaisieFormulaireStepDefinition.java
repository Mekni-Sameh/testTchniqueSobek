package formulaire;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SaisieFormulaireStepDefinition {

	// Ouvrir WebDriver(si le webdriver est configuré on peut directement faire appel a la configuration)
	WebDriver driver = new ChromeDriver();

	public SaisieFormulairePageObject saisieFormulairePageObject = new SaisieFormulairePageObject();

	@Given("la page de formulaire est affichée")
	public void la_page_de_formulaire_est_affichée() {
		driver.get("url");
		driver.manage().window().maximize();

	}

	@When("je saisie le nom avec {string}")
	public void je_saisie_le_nom_avec(String string) {
		saisieFormulairePageObject.saisieNom(string);
	}

	@When("je saisie le prenom avec {string}")
	public void je_saisie_le_prenom_avec(String string) {
		saisieFormulairePageObject.saisiePrenom(string);

	}

	@When("je selectionne la ville {string}")
	public void je_selectionne_la_ville(String string) {
		saisieFormulairePageObject.saisieVille(string);

	}

	@When("je saisie mon email {string}")
	public void je_saisie_mon_email(String string) {
		saisieFormulairePageObject.saisieMail(string);
	}

	@When("je saisie mon numero de telephone {string}")
	public void je_saisie_mon_numero_de_telephone(String string) {
		saisieFormulairePageObject.saisieTel(string);
	}

	@When("je clique sur le bouton Envoyer")
	public void je_clique_sur_le_bouton_envoyer() {
		saisieFormulairePageObject.envoyerformulaire();

	}

	@Then("un pop s affiche {string}")
	public void un_pop_s_affiche(String string) {
		String resultatObtenu = saisieFormulairePageObject.retounerFormulaireConfOK();
		Assert.assertTrue(resultatObtenu.contains(string));
	}

	@Then("un pop2 s affiche {string}")
	public void un_pop2_s_affiche(String string) {
		String resultatObtenu = saisieFormulairePageObject.retounerErreurFormulaire();
		Assert.assertTrue(resultatObtenu.contains(string));
	}
}
