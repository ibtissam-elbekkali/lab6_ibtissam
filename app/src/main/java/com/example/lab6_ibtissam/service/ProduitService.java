package com.example.lab6_ibtissam.service;

import com.example.lab6_ibtissam.R;
import com.example.lab6_ibtissam.classes.Produit;
import com.example.lab6_ibtissam.dao.IDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProduitService implements IDao<Produit> {

    private static ProduitService INSTANCE;
    private final List<Produit> data = new ArrayList<>();

    private ProduitService() {
        seed(); // préremplissage
    }

    public static ProduitService getInstance() {
        if (INSTANCE == null) INSTANCE = new ProduitService();
        return INSTANCE;
    }

    private void seed() {
        data.add(new Produit("Pizza Margherita", 50,
                R.drawable.pizza_margherita, "10 min",
                "Pâte à pizza\nSauce tomate\nMozzarella\nHuile d'olive\nBasilic frais",
                "Pizza classique italienne, simple et légère, idéale pour tous les goûts.",
                "1. Étaler la pâte à pizza.\n2. Ajouter la sauce tomate\n3. Mettre la mozzarella.\n4. Cuire au four à 220°C pendant 10 min\n5. Ajouter le basilic et un filet d’huile d’olive"));

        data.add(new Produit("Pizza Végétarienne", 60,
                R.drawable.pizza_vegetarian, "15 min",
                "Pâte à pizza\nSauce tomate\nPoivrons\nChampignons\nOlives\nTomates\nMozzarella",
                "Pizza riche en légumes, fraîche et saine, parfaite pour les végétariens.",
                "1. Étaler la pâte\n2. Ajouter la sauce tomate\n3. Ajouter les légumes coupés\n4. Ajouter le fromage\n5. Cuire au four 12–15 min"));

        data.add(new Produit("Pizza Pepperoni", 65,
                R.drawable.pizza_peperoni, "12 min",
                "Pâte à pizza\nSauce tomate\nMozzarella\nTranches de pepperoni",
                "Pizza américaine très populaire, savoureuse et légèrement épicée.",
                "1. Étaler la pâte\n2. Ajouter la sauce\n3. Ajouter mozzarella\n4. Disposer les tranches de pepperoni\n5. Cuire au four 12 min"));

        data.add(new Produit("Pizza Poulet BBQ", 75,
                R.drawable.pizza_poulet, "18 min",
                "Pâte à pizza\nSauce barbecue\nPoulet grillé\nOignons\nMozzarella",
                "Pizza moderne avec un goût sucré-salé grâce à la sauce BBQ.",
                "1. Étaler la pâte\n2. Ajouter la sauce BBQ\n3. Ajouter le poulet et les oignons\n4. Ajouter le fromage\n5. Cuire au four 15 min"));

        data.add(new Produit("Pizza 4 Fromages", 70,
                R.drawable.pizza_4_fromages, "15 min",
                "Pâte à pizza\nCrème fraîche ou sauce tomate\nMozzarella\nGorgonzola\nParmesan\nFromage de chèvre",
                "Pizza très riche et crémeuse, idéale pour les amateurs de fromage.",
                "1. Étaler la pâte\n2. Ajouter la base (crème ou sauce tomate)\n3. Ajouter les 4 fromages\n4. Cuire au four 15 min"));
    }

    @Override
    public Produit create(Produit p) {
        data.add(p);
        return p;
    }

    @Override
    public Produit update(Produit p) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == p.getId()) {
                data.set(i, p);
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean delete(long id) {
        return data.removeIf(x -> x.getId() == id);
    }

    @Override
    public Produit findById(long id) {
        for (Produit p : data) if (p.getId() == id) return p;
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return Collections.unmodifiableList(data);
    }
}