public class AfishaManager {

    private String[] films = new String[0];
    private int limit;

    public void add(String newMovie) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = newMovie;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public AfishaManager() {
        this.limit = 5;
    }

    public AfishaManager(int limit) {
        this.limit = limit;
    }

    public String[] findLast() {
        int resultLength;
        if (limit < films.length) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = films[films.length - 1 - i];

        }
        return result;
    }
}
