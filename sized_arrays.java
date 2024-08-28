import java.util.Arrays;

public class sized_arrays {
    public static void main(String[] args) {
        String[][] characters ={{"naruto","saske","sakura"},{"Ayaka","Raiden Shogun","Novel"},{"sung jinwoo","Beru","Kaisel"}}; 
        for(String[] eachSeries: characters){
            for(String eachCharacter: eachSeries){
                System.out.println(eachCharacter);
            }
        }
        System.out.println(Arrays.deepToString(characters));
    }
}
