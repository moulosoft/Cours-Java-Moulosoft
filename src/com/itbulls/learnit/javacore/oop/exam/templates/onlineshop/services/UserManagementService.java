// Ce package définit l'emplacement exact de ce fichier dans la structure de votre projet Java.
package com.itbulls.learnit.javacore.oop.exam.templates.onlineshop.services;

// On importe la classe User qui représente un utilisateur dans notre boutique en ligne.
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.User;

// On déclare une interface nommée UserManagementService.
// Une interface en Java définit un contrat : elle spécifie les méthodes qu'une classe doit implémenter.
// Cette interface sert à définir les opérations de base pour gérer les utilisateurs.
public interface UserManagementService {

    // Cette méthode permet d'enregistrer un nouvel utilisateur.
    // Elle prend en paramètre un objet User contenant les informations de l'utilisateur.
    // Elle retourne une chaîne de caractères qui pourrait indiquer un message de succès, d'erreur, etc.
    String registerUser(User user);
    
    // Cette méthode permet de récupérer tous les utilisateurs enregistrés.
    // Elle retourne un tableau d'objets User, ce qui signifie qu'elle peut retourner plusieurs utilisateurs.
    User[] getUsers();

    // Cette méthode permet de récupérer un utilisateur spécifique en utilisant son adresse email.
    // Elle prend en paramètre une chaîne de caractères représentant l'adresse email.
    // Elle retourne un objet User correspondant à l'adresse email fournie, ou null si aucun utilisateur n'est trouvé.
    User getUserByEmail(String userEmail);
}
