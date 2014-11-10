
public class TestMovie3 {

	public static void printMovies(Movie2[] m){
		for(int i = 0; i < m.length; i++){
			System.out.println(m[i].toString());
		}
	}
	
	public static Movie2[] sortYear(Movie2[] movies, int order){
		Movie2 temp;
		int max;
		int min;
		if(order == 1){
			for(int i = movies.length - 1; i >= 0; i--){
				max = 0;
				for(int e = 0; e <= i; e++){
					if(movies[e].getMyYear() > movies[max].getMyYear()){
						max = e;
					}
				}
				temp = movies[i];
				movies[i] = movies[max];
				movies[max] = temp;
			}
		}else if(order == 2){
			for(int i = movies.length - 1; i >= 0; i--){
				min = 0;
				for(int e = 0; e <= i; e++){
					if(movies[e].getMyYear() < movies[min].getMyYear()){
						min = e;
					}
				}
				temp = movies[i];
				movies[i] = movies[min];
				movies[min] = temp;
			}
		}
		return movies;
	}
	
	public static Movie2[] sortTitles(Movie2[] movies, int order){
		Movie2 temp;
		int max;
		int min;
		if(order == 1){
			for(int i = movies.length - 1; i >= 0; i--){
				max = 0;
				for(int e = 0; e <= i; e++){
					if(movies[e].getMyTitle().compareTo(movies[max].getMyTitle()) > 0){
						max = e;
					}
				}
				temp = movies[i];
				movies[i] = movies[max];
				movies[max] = temp;
			}
		}else if(order == 2){
			for(int i = movies.length - 1; i >= 0; i--){
				min = 0;
				for(int e = 0; e <= i; e++){
					if(movies[e].getMyTitle().compareTo(movies[min].getMyTitle()) < 0){
						min = e;
					}
				}
				temp = movies[i];
				movies[i] = movies[min];
				movies[min] = temp;
			}
		}
		return movies;
	}
	
	public static Movie2[] sortStudios(Movie2[] movies, int order){
		Movie2 temp;
		int max;
		int min;
		if(order == 1){
			for(int i = movies.length - 1; i >= 0; i--){
				max = 0;
				for(int e = 0; e <= i; e++){
					if(movies[e].getMyStudio().compareTo(movies[max].getMyStudio()) > 0){
						max = e;
					}
				}
				temp = movies[i];
				movies[i] = movies[max];
				movies[max] = temp;
			}
		}else if(order == 2){
			for(int i = movies.length - 1; i >= 0; i--){
				min = 0;
				for(int e = 0; e <= i; e++){
					if(movies[e].getMyStudio().compareTo(movies[min].getMyStudio()) < 0){
						min = e;
					}
				}
				temp = movies[i];
				movies[i] = movies[min];
				movies[min] = temp;
			}
		}
		return movies;
	}
	
	public static void main(String[] args) {
		
		Movie2[] myMovies = new Movie2[10];
		
		myMovies[0] = new Movie2("The Muppets Take Manhattan", 2001, "Columbia Tristar");
		myMovies[1] = new Movie2("Mulan Special Edition", 2004, "Disney");
		myMovies[2] = new Movie2("Shrek 2", 2004, "Dreamworks");
		myMovies[3] = new Movie2("The Incredibles", 2004, "Pixar");
		myMovies[4] = new Movie2("Nanny McPhee", 2006, "Universal");
		myMovies[5] = new Movie2("The Curse of the Were-Rabbit", 2006, "Aardman");
		myMovies[6] = new Movie2("Ice Age", 2002, "20th Century Fox");
		myMovies[7] = new Movie2("Lilo & Stitch", 2002, "Disney");
		myMovies[8] = new Movie2("Robots", 2005, "20th Century Fox");
		myMovies[9] = new Movie2("Monsters, Inc.", 2001, "Pixar");
		
		System.out.println("Before Sorting:");
		printMovies(myMovies);

		System.out.println();
		System.out.println("Sorted by Year - Ascending:");
		printMovies(sortYear(myMovies, 1));
		
		System.out.println();
		System.out.println("Sorted by Year - Descending:");
		printMovies(sortYear(myMovies, 2));
		
		System.out.println();
		System.out.println("Sorted by Title - Ascending:");
		printMovies(sortTitles(myMovies, 1));
		
		System.out.println();
		System.out.println("Sorted by Title - Descending:");
		printMovies(sortTitles(myMovies, 2));
		
		System.out.println();
		System.out.println("Sorted by Studio - Ascending:");
		printMovies(sortStudios(myMovies, 1));
		
		System.out.println();
		System.out.println("Sorted by Studio - Descending:");
		printMovies(sortStudios(myMovies, 2));
		
	}
}
