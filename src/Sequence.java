class Sequence{
    private PegSequence answer, guess;

    Sequence(PegSequence answer, PegSequence guess) {
        this.answer = answer;
        this.guess = guess;
    }

    PegSequence getComparison(){
        PegSequence perfectMatches = new PegSequence();
        PegSequence partialMatches = new PegSequence();

        this.detectMatches(perfectMatches, partialMatches);
        return this.buildResponse(perfectMatches, partialMatches);
    }

    private void detectMatches(PegSequence perfect, PegSequence partial){
        this.guess.getPegs().forEach(pin -> {
            int position = this.guess.getPegs().indexOf(pin);

            if (this.answer.getPegs().get(position).equals(pin)){
                perfect.getPegs().add(Colors.black);
            } else if (this.answer.getPegs().contains(pin)){
                partial.getPegs().add(Colors.white);
            }
        });
    }

    private PegSequence buildResponse(PegSequence perfect, PegSequence partial){

        PegSequence response = new PegSequence(perfect, partial);

        while (response.getPegs().size() < Answer.MAX_ANSWER_LENGTH){response.getPegs().add("0"); }
        return response;
    }
}