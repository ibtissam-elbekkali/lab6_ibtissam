#  Lab 6 – Application Android : Liste de Pizzas

> **TP Android – Développement Mobile | Java**  
> Réalisé par : Ibtissam El Bekkali

---

## Description

Ce TP a pour but de développer une application Android en Java qui affiche une **liste de pizzas** avec leur nom, prix, durée de préparation et image, puis permet d'accéder au **détail complet** de chaque recette.

---

## Objectifs pédagogiques

-  Organiser un projet Android en **packages logiques** (`classes`, `dao`, `service`, `adapter`, `ui`)
-  Manipuler une **ListView** avec un **Adapter personnalisé**
-  Assurer le **passage de données entre activités** (`Intent`)
-  Implémenter un **Splash Screen animé**
-  Mettre en œuvre un **modèle de données orienté objet**

---

## Structure du projet

```
app/src/main/java/com/example/lab6/
│
├── classes/
│   └── Pizza.java              # Modèle de données (nom, prix, durée, image)
│
├── dao/
│   └── PizzaDAO.java           # Accès aux données (liste des pizzas)
│
├── service/
│   └── PizzaService.java       # Logique métier
│
├── adapter/
│   └── PizzaAdapter.java       # Adapter personnalisé pour la ListView
│
└── ui/
    ├── SplashActivity.java     # Écran de démarrage animé
    ├── MainActivity.java       # Liste des pizzas
    └── DetailActivity.java     # Détail d'une pizza
```

---

## Fonctionnalités

###  Splash Screen
- Animation au lancement de l'application
- Redirection automatique vers la liste après quelques secondes

###  Liste des pizzas (`MainActivity`)
- Affichage via une `ListView` avec un adapter personnalisé
- Chaque élément affiche :
  -  Image de la pizza
  -  Nom
  -  Prix
  -  Durée de préparation

###  Détail d'une pizza (`DetailActivity`)
- Accès au détail en cliquant sur un élément de la liste
- Passage des données via `Intent`
- Affichage complet de la recette

---

##  Modèle de données

```java
public class Pizza {
    private String nom;
    private double prix;
    private int dureePreparation; // en minutes
    private int image;            // ressource drawable
    // + constructeurs, getters, setters
}
```

---

##  Technologies utilisées

| Technologie | Version |
|-------------|---------|
| Langage | Java |
| Plateforme | Android SDK |
| UI | XML Layouts |
| Composant liste | ListView + BaseAdapter |

---

##  Lancer le projet

1. **Cloner le dépôt :**
   ```bash
   git clone https://github.com/ibtissam-elbekkali/lab6_ibtissam.git
   ```

2. **Ouvrir dans Android Studio**

3. **Synchroniser Gradle**

4. **Lancer sur un émulateur ou un appareil physique** (API 21+)

---

##  Aperçu des écrans


https://github.com/user-attachments/assets/c72251cf-ee45-44bf-8855-7d04c089649e



---

##  Auteure

**Ibtissam El Bekkali**  
🔗 [github.com/ibtissam-elbekkali](https://github.com/ibtissam-elbekkali)
