NETANGE Clément
DEFOLIE Julien



Remarques : 

1 - il faut ajouter deux méthodes de comparaison pour titre et artiste dans CD. Voici un exemple : 

``` java
public boolean etreAvantArtiste(CD cd) {
		return (this.nomArtiste.compareTo(cd.nomArtiste) < 0);
	}
```

2 - Vous devez revoir vos méthodes de tri. Les deux méthodes de tri sont codées de la même manière avec une légère différence. Voici un exemple : 
``` java
public void trierAlbum() {
		// tri par selection
		int nbCDs = this.listeCds.size();
		for (int i = 0; i < nbCDs; i++) {
			CD cdSelectionne = this.listeCds.get(i);
			
			//selectionne plus petit 
			int indiceSelection = i;
			for (int j = i + 1; j < nbCDs; j++) {
				CD cdTemp = listeCds.get(j);
				if (cdTemp.etreAvantAlbum(cdSelectionne)) {
					indiceSelection = j;
					cdSelectionne = cdTemp;
				}
			}
			listeCds.set(indiceSelection, listeCds.get(i));
			listeCds.set(i, cdSelectionne);
		}
	}
```

