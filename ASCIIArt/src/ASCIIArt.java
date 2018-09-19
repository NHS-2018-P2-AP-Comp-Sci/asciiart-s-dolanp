
public class ASCIIArt {
	public static void oceanTop() {
		System.out.print("--^--^--^--^");
	}
	public static void boxFish() {
		System.out.println(" ____   ____      ____");
		System.out.println(" |*  |/ |*  |/   \\|  *|");
		System.out.println(" |___|\\ |___|\\   /|___| ");
	}
	public static void longFish() {
		System.out.print("><((((°> ");
		System.out.print("><((((°> ");
		System.out.println("><((((°> ");
	}
	public static void seaWeed() {
		System.out.println("( ( ( ( ( ( ( ( ( ( ( ( (");
		System.out.println(" ) ) ) ) ) ) ) ) ) ) ) ) )");
		System.out.println("( ( ( ( ( ( ( ( ( ( ( ( (");
		System.out.println("_)_)_)_)_)_)_)_)_)_)_)_)_)_");
	}
	public static void main (String[] args) {
		oceanTop();
		oceanTop();
		System.out.println("");
		boxFish();
		System.out.println("");
		longFish();
		longFish();
		boxFish();
		System.out.println("");
		longFish();
		System.out.println("");
		seaWeed();
		System.out.println("\n\"This is a representation of the ocean.");
		System.out.println("There are waves, fish and seaweed!\"");
	}
}
