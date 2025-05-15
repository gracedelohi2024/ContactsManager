# ContactsManager

*ContactsManager* est un programme Java de gestion de contacts, simple et orientée console c'est à dire, le programme fonctionne entièrement via la ligne de commande (ou le terminal), sans interface graphique. Il permet d’ajouter des contacts et de rechercher un numéro à partir d’un nom.


## Fonctionnalités

- Ajouter un contact (nom + numéro de téléphone)
- Rechercher un contact par nom
- Afficher le numéro de téléphone du contact recherché

## Structure du projet

- Contact.java          : Définition d'un contact (nom, téléphone)
- ContactsManager.java  : Gestion de la liste de contacts (ajout, recherche)
- Main.java             : Point d'entrée de l'application

## Compilation

Placez-vous dans le dossier contenant les fichiers .java, puis exécutez :

bash
javac Main.java ContactsManager.java Contact.java


## Exécution

bash
java Main
