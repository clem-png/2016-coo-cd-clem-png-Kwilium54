package donnees;

public class ComparateurAlbum implements ComparateurCD{

        @Override
        public boolean etreAvant(CD cd1, CD cd2) {
            return (cd1.getAlbum().compareTo(cd2.getAlbum()) < 0);
        }
}
