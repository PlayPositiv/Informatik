
import processing.core.PApplet;
/**
 * Klasse Kaffehaus.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kaffehaus extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(640,400);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(255);
        stroke(153);
        parallelen();
        fill(0);
        Quadrat();
    }

    public void parallelen(){
        for(int i=0; i < 10; i++){
            line(0, 40*i, 640, 40*i);
        }
    }

    public void Quadrat(){
        for (int q=0; q < 9; q++){
            int[]a={0,10,20,10,0,10,20,10,0};
            for (int s=0; s < 8; s++){
                square(s*80,40*q,40);
            }

        }
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
        PApplet.main(new String[] {Kaffehaus.class.getName() });
    }

}
