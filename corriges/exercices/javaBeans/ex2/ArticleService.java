/**
 * Exercice JavaBean 2
 * 
 * Créer une classe ArticleService définissant une méthode creerArticle
 * qui à un parametre de type Article.
 * Cette methode doit afficher le libéllé et le numéero de l'article.
 */

package corriges.exercices.javaBeans.ex2;

// Classe ArticleService
public class ArticleService {
    // Méthode creerAriticle
    public void creerArticle(Article article) {
        System.out.println(article.getLibelle());
        System.out.println(article.getNumero());
    }
}
