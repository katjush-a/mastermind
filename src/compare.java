class Sequence{

    private char[] input;

    Sequence(char[] chars){
        this.input = chars;
    }

    char[] compare(char[] sequence){
        char[] output = {'0','0','0','0'};

        for(int i = 0; i < 4; i++) {

            if(sequence[i] == input[i]){
                output[i] = 'B';
            } else {
                for(int j = 0;j < 4;j++){
                    if(sequence[i] == input[j]
                            && i != j){
                        output[i] = 'W';
                    }
                }
            }
        }
        return output;
    }
}