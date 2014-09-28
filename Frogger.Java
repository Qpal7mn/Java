import java.util.ArrayList;

import zen.core.Zen;


public class Frogger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zen.create(800,500);

		Frog f = new Frog();
		f.setup();

		ArrayList<Truck> list = new ArrayList<Truck>();


		int count = 0;
		while(count < 20){
			Truck t = new Truck();
			t.setup();
			list.add(t);

			count = count + 1;
		}




		int x = -100;

		while (1 < 2){
			//drawstuff
			drawBackground();


			f.draw();
			f.move();



			for (Truck t : list) {
				t.draw();
				t.move();
				//Tell every truck to draw and move
				if(t.isKilling(f)){
					//if the truck is killing the frog
					System.out.println("YOU ARE DEAD");
					f.setup();
				}
			}

			Zen.setColor("Orange");


			Zen.buffer(33);


		}
	}


	private static void drawBackground() {
		// TODO Auto-generated method stub

		Zen.setBackground("grey");
		Zen.setColor("green");
		Zen.fillRect(0,0,800,25);
		Zen.fillRect(0, 475, 800, 25);
		Zen.setColor("turquoise");
		Zen.fillRect(0, 25, 800, 125);

		int x;
		int y;
		y= 160;
		Zen.setColor("yellow");
		while(y < 500){
			//Start x at 10
			x = 10;
			//While x is still valid
			while( x < 800){

				Zen.fillRect(x, y, 10, 3);
				//Make x bigger by 20, then try again
				x = x + 20;
			}
			y = y + 50;
		}


	}

}
