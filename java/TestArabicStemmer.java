import org.tartarus.snowball.ext.arabicStemmer;


public class TestArabicStemmer {
 	public static void main(String args[]) {

		arabicStemmer stemmer = new arabicStemmer();
		stemmer.setCurrent("العربية");
		if (stemmer.stem()){
    			System.out.println(stemmer.getCurrent());
		}
	}
}
