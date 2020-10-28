public class ColorTester {

    public static void main(String[] args) {
        Color new_color = new Color(161, 131, 131);
        Color randomColor = new Color();
    
        System.out.println(new_color.willDisplay());
        System.out.println(randomColor.willDisplay());

        new_color.BrightenColor(60);
        new_color.DarkenColor(20);

        System.out.println(new_color.willDisplay());
        System.out.println(randomColor.willDisplay());
    }

}