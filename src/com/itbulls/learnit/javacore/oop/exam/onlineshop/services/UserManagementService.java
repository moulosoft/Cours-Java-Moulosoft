package com.itbulls.learnit.javacore.oop.exam.onlineshop.services;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.entities.User;

// Interface définissant les opérations possibles sur les utilisateurs
public interface UserManagementService {

    // Méthode pour enregistrer un nouvel utilisateur
    // Retourne une chaîne de caractères, probablement un message de confirmation ou un identifiant
    String registerUser(User user);

    // Méthode pour récupérer tous les utilisateurs
    // Retourne un tableau d'objets User, contenant tous les utilisateurs enregistrés
    User[] getUsers();

    // Méthode pour récupérer un utilisateur par son adresse email
    // Prend en paramètre une adresse email de type String
    // Retourne un objet User correspondant à l'adresse email, ou null si l'utilisateur n'est pas trouvé
    User getUserByEmail(String userEmail);
}
