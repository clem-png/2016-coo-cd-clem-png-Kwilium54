package donnees;

import java.util.ArrayList;

/**
 * La classe Magasin represente un magasin qui vend des CDs.</p>
 * 
 * cette classe est caracterisee par un ensemble de CDs correspondant aux CDS
 * vendus dans ce magasin.
 * 
 */
public class Magasin {

	/**
	 * la liste des CDs disponibles en magasin
	 */
	private ArrayList<CD> listeCds;

	/**
	 * construit un magasin par defaut qui ne contient pas de CD
	 */
	public Magasin() {
		listeCds = new ArrayList<CD>();
	}

	/**
	 * ajoute un cd au magasin
	 * 
	 * @param cdAAjouter
	 *            le cd a ajouter
	 */
	public void ajouteCd(CD cdAAjouter) {
		listeCds.add(cdAAjouter);
	}

	@Override
	/**
	 * affiche le contenu du magasin
	 */
	public String toString() {
		String chaineResultat = "";
		//parcours des Cds
		for (int i = 0; i < listeCds.size(); i++) {
			chaineResultat += listeCds.get(i);
		}
		chaineResultat += "nb Cds: " + listeCds.size();
		return (chaineResultat);

	}

	/**
	 * @return le nombre de Cds du magasin
	 */
	public int getNombreCds() {
		return listeCds.size();
	}
	
	/**
	 * permet d'acceder � un CD
	 * 
	 * @return le cd a l'indice i ou null si indice est non valide
	 */
	public CD getCd(int i)
	{
		CD res=null;
		if ((i>=0)&&(i<this.listeCds.size()))
			res=this.listeCds.get(i);
		return(res);
	}

	public void trierAriste() {
		for(int i = 0 ; i < listeCds.size() ; i++){
			for(int j = 0 ; j < listeCds.size() ; j++){
				if(listeCds.get(i).compareTo(listeCds.get(j)) < 0){
					CD temp = listeCds.get(i);
					listeCds.set(i, listeCds.get(j));
					listeCds.set(j, temp);
				}
			}
		}

	}

	public void trierAlbum() {
		//tri par selection
		//j'ai mit x et y pour changer des i et j
		//
			//je prends la taille de la liste, le nombre de CD
			int n = listeCds.size();

			for(int x = 0; x< (n-1); x++) {

				int minI = x;

				for(int y = x + 1; y < n; y++) {
					//la méthode de comparaison compareTo renvoie un int
					if(listeCds.get(y).compareTo(listeCds.get(minI)) < 0) {
						minI = y;
					}

				}

				if(minI != x) {

					CD t = listeCds.get(x);
					listeCds.set(x, listeCds.get(minI));
					listeCds.set(minI, t);

				}

			}

		}



	public int getTaille() {
		return listeCds.size();
	}

	// TODO  ajouter une methode de tri

}
