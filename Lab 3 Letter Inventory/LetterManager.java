public class LetterManager {

    final int Alphabet = 26;
    private LetterInventory[] word = new LetterInventory[Alphabet];




    public  void CharMoniker(){
        char[] letterName = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] letterAmount = {0};


        for(int count = 0; count < 26; count++) {
            word[count] = 
                new LetterInventory(letterAmount[1], letterName[count]);

    }
}
}