import javax.swing.JOptionPane;

public class rollercoaster {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(" hight?");
		int hight = Integer.parseInt(input);
		if (hight >= 61) {
			System.out.println(" You can go on the roller coaster!");

		}
		else{
			System.out.println(" Sorry you can not go on the roller coaster");
			
		}
	}
}