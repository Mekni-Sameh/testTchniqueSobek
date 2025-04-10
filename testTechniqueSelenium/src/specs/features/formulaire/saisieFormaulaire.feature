Feature: Formulaire choix de destination

 En tant que utilisateur Je veux pouvoir choisir ma destination de voyage Afin de pouvoir planifier mon voyage.
 
@connexionOK

Scenario: Saisie le formulaire avec des identifiants valides 

Given la page de formulaire est affichée
When je saisie le nom avec "Mekni"
And je saisie le prenom avec "Sameh"
And je selectionne la ville "Paris"
And je saisie mon email "sm@gmail.com"
And je saisie mon numero de telephone "0612121212" 
And je clique sur le bouton Envoyer
Then un pop s affiche "Merci pour vos informations !"

@connexionKO
Scenario: remplir le formulaire sans mettre le mail et le numero de tel
Given la page de formulaire est affichée
When je saisie le nom avec "Mekni"
And je saisie le prenom avec "Sameh"
And je selectionne la ville"Paris"
And je saisie mon email""
And je saisie mon numero de telephone "" 
And je clique sur le bouton Envoyer
Then un pop2 s affiche "Veuillez remplir au moins l'adresse email ou le numéro de téléphone."