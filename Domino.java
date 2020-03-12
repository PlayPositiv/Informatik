
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Domino.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Domino extends PApplet
{   int s=50;
    int farbe=255;
            /**
             * settings() Methode 
             * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
             */
    @Override
    public void settings()
    {
        size(500,500);
    }        

    public void zeichneQuadrate(int x, int y, int hintergrundFarbe, boolean links){
        fill(hintergrundFarbe);
        square(x,y,s);
        if(hintergrundFarbe == 0){
            fill(255);
        }
        else{
            fill(0);
        }
        circle(x + 40, y + 10, 10);
        circle(x + 40, y + 40, 10);
    }

    public void quadrat(){
        for (int i = 0; i < 10; i++){
            farbe=255;
            
            zeichneQuadrate(i*s, 0, farbe, true);
        }
    }

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        zeichneQuadrate(0, 0, 0, true);
//AAAAAAAAAAAAAAAAAAAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Domino.class.getName() });
    }

}
