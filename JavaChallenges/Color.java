import java.util.Random;

public class Color {

	private int red;
	private int green;
    private int blue;
    private int percent;
	Random rand = new Random();

	public Color() {

		red = rand.nextInt( 256 );
		green = rand.nextInt( 256 );
		blue = rand.nextInt( 256 );

	}

	public Color( int red, int green, int blue ) {

		this.red = red;
		this.green = green;
		this.blue = blue;

    }
    
	public void setRed( int red ) { 
		this.red = red; 
		finalColor();
	}
	public void setRed() { 
        red = rand.nextInt( 256 ); 
    }

	public void setGreen( int green ) { 
		this.green = green; 
		finalColor();
	}
	public void setGreen() { 
        green = rand.nextInt( 256 ); 
    }

	public void setBlue( int blue ) { 
		this.blue = blue;
        finalColor();
    }

    public void BrightenColor(int i){
        red = red * (1+(percent/100));
        green = green * (1+(percent/100));
        blue = blue * (1 + (percent/100));
    }

    public void DarkenColor(int i){
        red = red * (percent/100);
        blue = blue * (percent/100);
        green = green * (percent/100);
    }

    public String willDisplay() {
        return "[" + red + "," + green + "," + blue + "]";
    }
        
    private void finalColor() {
            if( red > 255 ) {
                red = 255;
            }
            if( red < 0 ) {
                red = 0;
            }
            if( green > 255 ) {
                green = 255;
            }
            if( green < 0 ) {
                red = 0;
            }
            if( blue > 255 ) {
                blue = 255;
            }
            if( blue < 0 ) {
                blue = 0; 
            }

        
    }
}