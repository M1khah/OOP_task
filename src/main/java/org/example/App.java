package org.example;


public class App
{
    public static void main( String[] args ) throws InstrumentIsBrokenException, NoVodkaException {
        Piano grandPiano = new Piano(100500, "Steinway");
        grandPiano.setColor(Color.VIOLET);
        grandPiano.addSong();
        grandPiano.sound();
        grandPiano.play(false);
        grandPiano.sell("100");
        grandPiano.getInCount();
        grandPiano.forWhat();

        Violin stradivari = new Violin(500);
        stradivari.setColor(Color.WHITE);
        stradivari.setPrice(200);
        stradivari.getPrice();
        stradivari.sound();
        stradivari.sell("12");
        stradivari.forWhat();
        stradivari.changeReason();
        stradivari.forWhat();


        Accordion bayan = new Accordion(0);
        bayan.setColor(Color.GREEN);
        bayan.getColor();
        bayan.sound();
        bayan.tear_apart();
        bayan.sell("999999999");
        bayan.murka("give me VoDkA");
        bayan.getSecret();
        bayan.setSecret("Spirit is the key");
        bayan.getSecret();
        bayan.forWhat();
        bayan.murka("give me passion");
    }
}
