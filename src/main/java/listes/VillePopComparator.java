package listes;

import java.util.Comparator;

public class VillePopComparator implements Comparator<Ville> {

    private boolean sens;

    public VillePopComparator(boolean sens) {
        this.sens = sens;
    }

    @Override
    public int compare(Ville o1, Ville o2) {

        int offset = 1;
        if (!sens){
            offset=-1;
        }

        if (o1.getPop()>o2.getPop()){
            return offset;
        }
        else if (o1.getPop() < o2.getPop()) {
            return -offset;
        }
        return 0;
    }
}
