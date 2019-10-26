package id.ac.polinema.recyclerviewsangatsederhana.models;

public class SuperHero {
    public String heroName;
    public int img;

    public SuperHero(String heroName, int img) {
        this.heroName = heroName;
        this.img = img;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

}
