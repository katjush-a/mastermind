class Sequence{

    private char[] input;

    Sequence(char[] chars){
        this.input = chars;
    }

    char[] compare(char[] sequence){
        char[] output;

        output = new char[4];

        for(int i = 0;i <= 3;i++){
            if(sequence[i] == input[i]){
                output[i] = 'b';
            } else {
                output[i] = '0';
            }
        }

        return output;
    }
}