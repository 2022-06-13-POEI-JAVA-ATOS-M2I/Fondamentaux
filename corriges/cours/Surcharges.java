/**
 * Exemple sur les surcharges
 */

package corriges.cours;

// Classe Imprimante avec surcharge de la méthode imprimer()
class Imprimante {
    public void imprimer(String document1, String document2) {
	System.out.println("imprimer1");
	System.out.println(document1 + document2);
	this.imprimer(document1, 2);
	this.imprimer(document2, 2);
    }
	
    public void imprimer(String... document1) {
	System.out.println("imprimer2");
	
	for (String doc : document1) {
		System.out.println(doc);
	}
    }
	
    public void imprimer(String document, Integer nombre) {
	System.out.println("imprimer3");
	
	for(int indice = 0; indice < nombre; indice++) {
		System.out.println(document);
	}
    }
	
    public void imprimer() {
	System.out.println("Page de test");
    }
}

// Classe principale
public class Surcharges {
    public static void main(String[] args) {
	Imprimante imprimante = new Imprimante();
	imprimante.imprimer();
	imprimante.imprimer("document1");
	imprimante.imprimer("doc1", "doc2");
	imprimante.imprimer("doc3", "doc4");
	imprimante.imprimer("document1", 3);
	imprimante.imprimer("doc5","doc6","doc7");
    }
}