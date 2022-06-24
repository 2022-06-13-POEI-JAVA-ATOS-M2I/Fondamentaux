/**
 * Exercice JavaBean 2
 * 
 * Programme principale.
 * Créer un objet du JavaBean Article et définir ses propriétés.
 * Creer un objet de la classe ArticleService.
 * Afficher les informations sur l'article et utilisatnt la methode creerArticle de la classe ArticleService.
 */

package corriges.exercices.javaBeans.ex2;

// Classe principale
public class Programme {
    public static void main(String[] args) {
        Article monArticle = new Article();
        monArticle.setLibelle("Article 1");
        monArticle.setNumero(1);

        ArticleService articleService = new ArticleService();
        articleService.creerArticle(monArticle);
    }
}