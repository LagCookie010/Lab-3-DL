public class LetterManager {

    final int Alphabet = 26;
    private LetterInventory[] word = new LetterInventory[Alphabet];




    public LetterManager(int number, char currentLScan){
        char[] letterName = {currentLScan};
        int[] letterAmount = {number};


        for(int count = 0; count < 26; count++) {
            word[count] = 
                new LetterInventory(letterAmount[1], letterName[count]);

    }
}




    public LetterInventory LetterManager(int number, char currentLScan) {
        char[] letterName = {currentLScan};
        int[] letterAmount = {number};


        for(int count = 0; count < 26; count++) {
 
            new LetterInventory(letterAmount[1], letterName[count]);


        throw new UnsupportedOperationException("Unimplemented method 'LetterManager'");
    }




}

}