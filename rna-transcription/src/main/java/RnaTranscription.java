class RnaTranscription {

    String transcribe(String dnaStrand) {
        if(dnaStrand.equals(""))
            return "";
        String result="";
        for(int i=0;i<dnaStrand.length(); i++){
            Character c=dnaStrand.charAt(i);
            if(Character.compare(c,'A')==0)
                result+="U";
            else if(Character.compare(c,'G')==0)
                result+="C";
            else if(Character.compare(c,'C')==0)
                result+="G";
            else
                result+="A";
        }
        // for(char i:dnaStrand.toCharArray()){
        //     if(i.equals("A"))
        //         result+="U";
        //     else if(i=="G")
        //         result+="C";
        //     else if(i=="C")
        //         result+="G";
        //     else
        //         result+="A";
        // }
        
        return result;
    }

}
