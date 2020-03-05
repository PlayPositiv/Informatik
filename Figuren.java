
import processing.core.PApplet;

/**
 * Klasse Figuren.
 * Beschreibung: 
 *
 * @author Simon Gebert 
 * @version 1.0 vom 05.02.2020
 */
public class Figuren extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500, 350); // Festlegen der Fenstergröße
    }        

    void zeichneBildC() {
        // Zeichne dir zunächst eine Skizze auf ein Blatt Papier und überlege dir, welche
        // Werte du den Methoden rect(x,y,b,h) und ellipse(x,y,b,h) übergeben musst, 
        // dass Bild C gezeichnet wird

        square(150, 25, 200);
        circle(250, 125, 175);
        circle(250, 125, 125);
        circle(250, 125, 75);
        circle(250, 350, 200);
        square(250, 300, 175);
        square(250, 300, 125);
        square(250, 300, 75);
        // ***** Ende der eigenen Anweisungen **********
    }

    //***** Zusatzaufgabe bzw. Hausaufgabe *************
    void zeichneBildA() {
        // ***** hier kommen deine Anweisungen hin ************
        circle(250, 350, 200);
        square(250, 300, 175);
        square(250, 300, 125);
        square(250, 300, 75);
        // ***** Ende der eigenen Anweisungen **********  
    }

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        zeichneBildC(); // Aufruf deiner Methode
        // zeichneBildA();
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Figuren.class.getName() });
    }

}
