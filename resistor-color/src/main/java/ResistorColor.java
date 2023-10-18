class ResistorColor {
    private String[] colorsList= {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
    int colorCode(String color) {
        for(int i=0;i<10;i++){
            if(colorsList[i].equals(color)){
                return i;
            }
        }
        return 11;
    }

    String[] colors() {
        return colorsList;
    }
}
