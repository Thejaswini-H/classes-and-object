class FilmIndustryUtil{
public static void main(String a[])
{
FilmIndustry film = new FilmIndustry();
film.name="Sandalwood";
film.country="India";
System.out.println(film.name+" "+film.country);
film.shooting();

FilmIndustry film1 = new FilmIndustry();
film1.name="Bollywood";
film1.country="India";
System.out.println(film1.name+" "+film1.country);
film1.shooting();

FilmIndustry film2 = new FilmIndustry();
film2.name="Nihon Elga";
film2.country="japan";
System.out.println(film2.name+" "+film2.country);
film2.shooting();
}
}

