import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font.*;

class South_Indian extends JFrame implements ActionListener // b1
{
	JLabel limage;
	JCheckBox c1, c2, c3, c4, c5, c6;
	JComboBox cb1, cb2, cb3, cb4, cb5, cb6;
	JButton b1;
	String qty[] = { " ", "1", "2", "3", "4" };
	Menu food_of_south;
	int si_total;

	South_Indian(Menu m) {
		// CREATING REFERENCE FROM WHERE IT IS CALLED
		food_of_south = m;

		// CREATING OBJECTS
		// OBJECTS OF JCheckBox
		ImageIcon i = new ImageIcon("images\\dosa.jpeg");
		limage = new JLabel(i);
		c1 = new JCheckBox("IDLI ------------------Rs 80");
		c2 = new JCheckBox("MASALA DOSA -----------Rs 150");
		c3 = new JCheckBox("MADU WADA -------------Rs 100");
		c4 = new JCheckBox("UTTAPAM ---------------Rs 110");
		c5 = new JCheckBox("PULIHORA --------------Rs 100");
		c6 = new JCheckBox("DOSA ------------------Rs 90");
		// OBJECTS OF JComboBox
		cb1 = new JComboBox(qty);
		cb2 = new JComboBox(qty);
		cb3 = new JComboBox(qty);
		cb4 = new JComboBox(qty);
		cb5 = new JComboBox(qty);
		cb6 = new JComboBox(qty);
		// OBJECT OF JButton
		b1 = new JButton("OKAY");

		// ADDING setBounds
		limage.setBounds(0, 0, 800, 450);
		c1.setBounds(50, 50, 200, 30);
		cb1.setBounds(300, 50, 50, 30);
		c2.setBounds(450, 50, 200, 30);
		cb2.setBounds(700, 50, 50, 30);
		c3.setBounds(50, 100, 200, 30);
		cb3.setBounds(300, 100, 50, 30);
		c4.setBounds(450, 100, 200, 30);
		cb4.setBounds(700, 100, 50, 30);
		c5.setBounds(50, 150, 200, 30);
		cb5.setBounds(300, 150, 50, 30);
		c6.setBounds(450, 150, 200, 30);
		cb6.setBounds(700, 150, 50, 30);
		b1.setBounds(350, 200, 100, 30);

		// ADDING TO THE FRAME
		this.add(limage);
		limage.add(c1);
		limage.add(c2);
		limage.add(c3);
		limage.add(c4);
		limage.add(c5);
		limage.add(c6);
		limage.add(cb1);
		limage.add(cb2);
		limage.add(cb3);
		limage.add(cb4);
		limage.add(cb5);
		limage.add(cb6);
		limage.add(b1);

		b1.addActionListener(this);
	}

	// a = obj.getTotal();
	public int getTotal() {
		return si_total;
	}

	public void actionPerformed(ActionEvent e) {
		si_total = 0;
		String s;
		int x;
		if (c1.isSelected()) {
			s = cb1.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			si_total = si_total + (80 * x);
		}
		if (c2.isSelected()) {
			s = cb2.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			si_total = si_total + (150 * x);
		}
		if (c3.isSelected()) {
			s = cb3.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			si_total = si_total + (100 * x);
		}
		if (c4.isSelected()) {
			s = cb4.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			si_total = si_total + (110 * x);
		}
		if (c5.isSelected()) {
			s = cb5.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			si_total = si_total + (100 * x);
		}
		if (c6.isSelected()) {
			s = cb6.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			si_total = si_total + (90 * x);
		}

		// System.out.println("Your south indian total amount is "+si_total);
		this.setVisible(false);
		food_of_south.setVisible(true);
	}
}

class Chinese extends JFrame implements ActionListener // b2
{
	JLabel limage;
	JCheckBox c1, c2, c3, c4, c5, c6;
	JComboBox cb1, cb2, cb3, cb4, cb5, cb6;
	JButton b1;
	String qty[] = { " ", "1", "2", "3", "4" };
	Menu food_of_chinese;
	int chi_total;

	Chinese(Menu m) {
		// CREATING REFERENCE FROM WHERE IT IS CALLED
		food_of_chinese = m;

		// CREATING OBJECTS
		// OBJECTS OF JCheckBox
		ImageIcon i = new ImageIcon("images\\chinese.jpg");
		limage = new JLabel(i);
		c1 = new JCheckBox("FIRED RICE ------------Rs 150");
		c2 = new JCheckBox("HAKKA NOODLES ---------Rs 150");
		c3 = new JCheckBox("MANCHURIAN ------------Rs 100");
		c4 = new JCheckBox("MANCHOW SOUP ----------Rs 100");
		c5 = new JCheckBox("SPRING ROLLS ----------Rs 80");
		c6 = new JCheckBox("GOLD FINGERS ----------Rs 80");
		// OBJECTS OF JComboBox
		cb1 = new JComboBox(qty);
		cb2 = new JComboBox(qty);
		cb3 = new JComboBox(qty);
		cb4 = new JComboBox(qty);
		cb5 = new JComboBox(qty);
		cb6 = new JComboBox(qty);
		// OBJECT OF JButton
		b1 = new JButton("OKAY");

		// ADDING setBounds
		limage.setBounds(0, 0, 800, 450);
		c1.setBounds(50, 50, 200, 30);
		cb1.setBounds(300, 50, 50, 30);
		c2.setBounds(450, 50, 220, 30);
		cb2.setBounds(700, 50, 50, 30);
		c3.setBounds(50, 100, 200, 30);
		cb3.setBounds(300, 100, 50, 30);
		c4.setBounds(450, 100, 220, 30);
		cb4.setBounds(700, 100, 50, 30);
		c5.setBounds(50, 150, 200, 30);
		cb5.setBounds(300, 150, 50, 30);
		c6.setBounds(450, 150, 200, 30);
		cb6.setBounds(700, 150, 50, 30);
		b1.setBounds(350, 200, 100, 30);

		// ADDING TO THE FRAME
		this.add(limage);
		limage.add(c1);
		limage.add(c2);
		limage.add(c3);
		limage.add(c4);
		limage.add(c5);
		limage.add(c6);
		limage.add(cb1);
		limage.add(cb2);
		limage.add(cb3);
		limage.add(cb4);
		limage.add(cb5);
		limage.add(cb6);
		limage.add(b1);

		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		chi_total = 0;
		String s;
		int x;
		if (c1.isSelected()) {
			s = cb1.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			chi_total = chi_total + (150 * x);
		}
		if (c2.isSelected()) {
			s = cb2.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			chi_total = chi_total + (150 * x);
		}
		if (c3.isSelected()) {
			s = cb3.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			chi_total = chi_total + (100 * x);
		}
		if (c4.isSelected()) {
			s = cb4.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			chi_total = chi_total + (100 * x);
		}
		if (c5.isSelected()) {
			s = cb5.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			chi_total = chi_total + (80 * x);
		}
		if (c6.isSelected()) {
			s = cb6.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			chi_total = chi_total + (80 * x);
		}
		// System.out.println("Your chinese total amount is "+chi_total);
		this.setVisible(false);
		food_of_chinese.setVisible(true);
	}
}

class Pav_Bhaji extends JFrame implements ActionListener // b3
{
	JLabel limage;
	JCheckBox c1, c2, c3, c4, c5, c6;
	JComboBox cb1, cb2, cb3, cb4, cb5, cb6;
	JButton b1;
	String qty[] = { " ", "1", "2", "3", "4" };
	Menu food_of_pav_bhaji;
	int pv_total;

	Pav_Bhaji(Menu m) {
		// CREATING REFERENCE FROM WHERE IT IS CALLED
		food_of_pav_bhaji = m;

		// CREATING OBJECTS
		// OBJECTS OF JCheckBox
		ImageIcon i = new ImageIcon("images\\pav bhaji.jpg");
		limage = new JLabel(i);
		c1 = new JCheckBox("PAV BHAJI -------------Rs 180");
		c2 = new JCheckBox("SPL. PAV BHAJI --------Rs 200");
		c3 = new JCheckBox("CHEESE PAV BHAJI ------Rs 200");
		c4 = new JCheckBox("MASALA BHAJI ----------Rs 170");
		c5 = new JCheckBox("JAIN PAV BHAJI --------Rs 190");
		c6 = new JCheckBox("BUTTER PAV ------------Rs 25");
		// OBJECTS OF JComboBox
		cb1 = new JComboBox(qty);
		cb2 = new JComboBox(qty);
		cb3 = new JComboBox(qty);
		cb4 = new JComboBox(qty);
		cb5 = new JComboBox(qty);
		cb6 = new JComboBox(qty);
		// OBJECT OF JButton
		b1 = new JButton("OKAY");

		// ADDING setBounds
		limage.setBounds(0, 0, 800, 450);
		c1.setBounds(50, 50, 220, 30);
		cb1.setBounds(300, 50, 50, 30);
		c2.setBounds(450, 50, 220, 30);
		cb2.setBounds(700, 50, 50, 30);
		c3.setBounds(50, 100, 220, 30);
		cb3.setBounds(300, 100, 50, 30);
		c4.setBounds(450, 100, 220, 30);
		cb4.setBounds(700, 100, 50, 30);
		c5.setBounds(50, 150, 220, 30);
		cb5.setBounds(300, 150, 50, 30);
		c6.setBounds(450, 150, 220, 30);
		cb6.setBounds(700, 150, 50, 30);
		b1.setBounds(350, 200, 100, 30);

		// ADDING TO THE FRAME
		this.add(limage);
		limage.add(c1);
		limage.add(c2);
		limage.add(c3);
		limage.add(c4);
		limage.add(c5);
		limage.add(c6);
		limage.add(cb1);
		limage.add(cb2);
		limage.add(cb3);
		limage.add(cb4);
		limage.add(cb5);
		limage.add(cb6);
		limage.add(b1);

		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		pv_total = 0;
		String s;
		int x;
		if (c1.isSelected()) {
			s = cb1.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			pv_total = pv_total + (180 * x);
		}
		if (c2.isSelected()) {
			s = cb2.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			pv_total = pv_total + (200 * x);
		}
		if (c3.isSelected()) {
			s = cb3.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			pv_total = pv_total + (200 * x);
		}
		if (c4.isSelected()) {
			s = cb4.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			pv_total = pv_total + (170 * x);
		}
		if (c5.isSelected()) {
			s = cb5.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			pv_total = pv_total + (190 * x);
		}
		if (c6.isSelected()) {
			s = cb6.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			pv_total = pv_total + (25 * x);
		}
		// System.out.println("Your pav bhaji total amount is "+pv_total);
		this.setVisible(false);
		food_of_pav_bhaji.setVisible(true);
	}
}

class Pizza extends JFrame implements ActionListener // b4
{
	JLabel pizza_image;
	JCheckBox c1, c2, c3, c4, c5, c6;
	JComboBox cb1, cb2, cb3, cb4, cb5, cb6;
	JButton b1;
	String qty[] = { " ", "1", "2", "3", "4" };
	Menu food_of_pizza;
	int pi_total;

	Pizza(Menu m) {
		// CREATING REFERENCE FROM WHERE IT IS CALLED
		food_of_pizza = m;

		// CREATING OBJECTS
		// OBJECTS OF JCheckBox
		ImageIcon i = new ImageIcon("images\\pizza.jpeg");
		pizza_image = new JLabel(i);
		c1 = new JCheckBox("VEG. PIZZA ------------Rs 200");
		c2 = new JCheckBox("VEG CHEESE PIZZA ------Rs 210");
		c3 = new JCheckBox("ONLY CHEESE PIZZA -----Rs 210");
		c4 = new JCheckBox("PANEER PIZZA ----------Rs 210");
		c5 = new JCheckBox("INDI TANDOORI PIZZA ---Rs 200");
		c6 = new JCheckBox("CHEESE N CORN ---------Rs 200");
		// OBJECTS OF JComboBox
		cb1 = new JComboBox(qty);
		cb2 = new JComboBox(qty);
		cb3 = new JComboBox(qty);
		cb4 = new JComboBox(qty);
		cb5 = new JComboBox(qty);
		cb6 = new JComboBox(qty);
		// OBJECT OF JButton
		b1 = new JButton("OKAY");

		// ADDING setBounds
		pizza_image.setBounds(0, 0, 800, 450);
		c1.setBounds(50, 50, 220, 30);
		cb1.setBounds(300, 50, 50, 30);
		c2.setBounds(450, 50, 220, 30);
		cb2.setBounds(700, 50, 50, 30);
		c3.setBounds(50, 100, 220, 30);
		cb3.setBounds(300, 100, 50, 30);
		c4.setBounds(450, 100, 220, 30);
		cb4.setBounds(700, 100, 50, 30);
		c5.setBounds(50, 150, 220, 30);
		cb5.setBounds(300, 150, 50, 30);
		c6.setBounds(450, 150, 220, 30);
		cb6.setBounds(700, 150, 50, 30);
		b1.setBounds(350, 200, 100, 30);
		// b1.setBounds(350,300,100,30);
		// b1.setBounds(325,300,150,25);

		// ADDING TO THE FRAME
		this.add(pizza_image);
		pizza_image.add(c1);
		pizza_image.add(c2);
		pizza_image.add(c3);
		pizza_image.add(c4);
		pizza_image.add(c5);
		pizza_image.add(c6);
		pizza_image.add(cb1);
		pizza_image.add(cb2);
		pizza_image.add(cb3);
		pizza_image.add(cb4);
		pizza_image.add(cb5);
		pizza_image.add(cb6);
		pizza_image.add(b1);
		/*
		 * add(c2);
		 * add(c3);
		 * add(c4);
		 * add(c5);
		 * add(c6);
		 * add(cb1);
		 * add(cb2);
		 * add(cb3);
		 * add(cb4);
		 * add(cb5);
		 * add(cb6);
		 * add(b1);
		 */
		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		pi_total = 0;
		String s;
		int x;
		if (c1.isSelected()) {
			s = cb1.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			pi_total = pi_total + (200 * x);
		}
		if (c2.isSelected()) {
			s = cb2.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			pi_total = pi_total + (210 * x);
		}
		if (c3.isSelected()) {
			s = cb3.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			pi_total = pi_total + (210 * x);
		}
		if (c4.isSelected()) {
			s = cb4.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			pi_total = pi_total + (210 * x);
		}
		if (c5.isSelected()) {
			s = cb5.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			pi_total = pi_total + (200 * x);
		}
		if (c6.isSelected()) {
			s = cb6.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			pi_total = pi_total + (200 * x);
		}
		// System.out.println("Your pizza total amount is "+pi_total);
		this.setVisible(false);
		food_of_pizza.setVisible(true);
	}
}

class Starters extends JFrame implements ActionListener // b5
{
	JLabel limage;
	JCheckBox c1, c2, c3, c4, c5, c6;
	JComboBox cb1, cb2, cb3, cb4, cb5, cb6;
	JButton b1;
	String qty[] = { " ", "1", "2", "3", "4" };
	Menu food_of_starters;
	int st_total;

	Starters(Menu m) {
		// CREATING REFERENCE FROM WHERE IT IS CALLED
		food_of_starters = m;

		// CREATING OBJECTS
		// OBJECTS OF JCheckBox
		ImageIcon i = new ImageIcon("images\\starters.jpg");
		limage = new JLabel(i);
		c1 = new JCheckBox("PANEER TIKKA ----------Rs 250");
		c2 = new JCheckBox("PANEER 65 -------------Rs 250");
		c3 = new JCheckBox("MUSHROOM TIKKA --------Rs 240");
		c4 = new JCheckBox("HARA BHARA KABAB ------Rs 210");
		c5 = new JCheckBox("VEG. HOT PAN ----------Rs 245");
		c6 = new JCheckBox("VEG. CANAPY -----------Rs 250");
		// OBJECTS OF JComboBox
		cb1 = new JComboBox(qty);
		cb2 = new JComboBox(qty);
		cb3 = new JComboBox(qty);
		cb4 = new JComboBox(qty);
		cb5 = new JComboBox(qty);
		cb6 = new JComboBox(qty);
		// OBJECT OF JButton
		b1 = new JButton("OKAY");

		// ADDING setBounds
		limage.setBounds(0, 0, 800, 450);
		c1.setBounds(50, 50, 220, 30);
		cb1.setBounds(300, 50, 50, 30);
		c2.setBounds(450, 50, 220, 30);
		cb2.setBounds(700, 50, 50, 30);
		c3.setBounds(50, 100, 220, 30);
		cb3.setBounds(300, 100, 50, 30);
		c4.setBounds(450, 100, 220, 30);
		cb4.setBounds(700, 100, 50, 30);
		c5.setBounds(50, 150, 220, 30);
		cb5.setBounds(300, 150, 50, 30);
		c6.setBounds(450, 150, 220, 30);
		cb6.setBounds(700, 150, 50, 30);
		b1.setBounds(350, 200, 100, 30);

		// ADDING TO THE FRAME
		this.add(limage);
		limage.add(c1);
		limage.add(c2);
		limage.add(c3);
		limage.add(c4);
		limage.add(c5);
		limage.add(c6);
		limage.add(cb1);
		limage.add(cb2);
		limage.add(cb3);
		limage.add(cb4);
		limage.add(cb5);
		limage.add(cb6);
		limage.add(b1);

		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		st_total = 0;
		String s;
		int x;
		if (c1.isSelected()) {
			s = cb1.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			st_total = st_total + (250 * x);
		}
		if (c2.isSelected()) {
			s = cb2.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			st_total = st_total + (250 * x);
		}
		if (c3.isSelected()) {
			s = cb3.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			st_total = st_total + (240 * x);
		}
		if (c4.isSelected()) {
			s = cb4.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			st_total = st_total + (210 * x);
		}
		if (c5.isSelected()) {
			s = cb5.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			st_total = st_total + (245 * x);
		}
		if (c6.isSelected()) {
			s = cb6.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			st_total = st_total + (250 * x);
		}
		// System.out.println("Your starters total amount is "+st_total);
		this.setVisible(false);
		food_of_starters.setVisible(true);
	}
}

class Desserts extends JFrame implements ActionListener // b6
{
	JLabel limage;
	JCheckBox c1, c2, c3, c4, c5, c6;
	JComboBox cb1, cb2, cb3, cb4, cb5, cb6;
	JButton b1;
	String qty[] = { " ", "1", "2", "3", "4" };
	Menu food_of_desserts;
	int des_total;

	Desserts(Menu m) {
		// CREATING REFERENCE FROM WHERE IT IS CALLED
		food_of_desserts = m;

		// CREATING OBJECTS
		// OBJECTS OF JCheckBox
		ImageIcon i = new ImageIcon("images\\desserts.jpg");
		limage = new JLabel(i);
		c1 = new JCheckBox("VANILLA ICE-CREAM -----Rs 180");
		c2 = new JCheckBox("CHOCOLATE ICE-CREAM ---Rs 200");
		c3 = new JCheckBox("DRY-FRUIT FALOODA -----Rs 250");
		c4 = new JCheckBox("DRINKING FALOODA ------Rs 220");
		c5 = new JCheckBox("GULAB JAMUN -----------Rs 100");
		c6 = new JCheckBox("CHOCOLATE BROWINE -----Rs 250");
		// OBJECTS OF JComboBox
		cb1 = new JComboBox(qty);
		cb2 = new JComboBox(qty);
		cb3 = new JComboBox(qty);
		cb4 = new JComboBox(qty);
		cb5 = new JComboBox(qty);
		cb6 = new JComboBox(qty);
		// OBJECT OF JButton
		b1 = new JButton("OKAY");

		// ADDING setBounds
		limage.setBounds(0, 0, 800, 450);
		c1.setBounds(50, 50, 220, 30);
		cb1.setBounds(300, 50, 50, 30);
		c2.setBounds(450, 50, 230, 30);
		cb2.setBounds(700, 50, 50, 30);
		c3.setBounds(50, 100, 220, 30);
		cb3.setBounds(300, 100, 50, 30);
		c4.setBounds(450, 100, 220, 30);
		cb4.setBounds(700, 100, 50, 30);
		c5.setBounds(50, 150, 220, 30);
		cb5.setBounds(300, 150, 50, 30);
		c6.setBounds(450, 150, 230, 30);
		cb6.setBounds(700, 150, 50, 30);
		b1.setBounds(350, 200, 100, 30);

		// ADDING TO THE FRAME
		this.add(limage);
		limage.add(c1);
		limage.add(c2);
		limage.add(c3);
		limage.add(c4);
		limage.add(c5);
		limage.add(c6);
		limage.add(cb1);
		limage.add(cb2);
		limage.add(cb3);
		limage.add(cb4);
		limage.add(cb5);
		limage.add(cb6);
		limage.add(b1);

		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		des_total = 0;
		String s;
		int x;
		if (c1.isSelected()) {
			s = cb1.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			des_total = des_total + (180 * x);
		}
		if (c2.isSelected()) {
			s = cb2.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			des_total = des_total + (200 * x);
		}
		if (c3.isSelected()) {
			s = cb3.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			des_total = des_total + (250 * x);
		}
		if (c4.isSelected()) {
			s = cb4.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			des_total = des_total + (220 * x);
		}
		if (c5.isSelected()) {
			s = cb5.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			des_total = des_total + (100 * x);
		}
		if (c6.isSelected()) {
			s = cb6.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			des_total = des_total + (250 * x);
		}
		// System.out.println("Your desserts total amount is "+des_total);
		this.setVisible(false);
		food_of_desserts.setVisible(true);
	}
}

class Soft_Drink extends JFrame implements ActionListener // b0
{
	JLabel limage;
	JCheckBox c1, c2, c3, c4, c5, c6;
	JComboBox cb1, cb2, cb3, cb4, cb5, cb6;
	JButton b1;
	String qty[] = { " ", "1", "2", "3", "4" };
	Menu food_of_soft_drinks;
	int sd_total;

	Soft_Drink(Menu m) {
		// CREATING REFERENCE FROM WHERE IT IS CALLED
		food_of_soft_drinks = m;

		// CREATING OBJECTS
		// OBJECTS OF JCheckBox
		ImageIcon i = new ImageIcon("images\\drinks.jpg");
		limage = new JLabel(i);
		c1 = new JCheckBox("MOJITO ----------------Rs 200");
		c2 = new JCheckBox("BLUEBERRY MINT --------Rs 200");
		c3 = new JCheckBox("ORANGE JUICE ----------Rs 150");
		c4 = new JCheckBox("MOSAMBI JUICE ---------Rs 150");
		c5 = new JCheckBox("CHOCOLATE SHAKE -------Rs 150");
		c6 = new JCheckBox("MANGO SHAKE -----------Rs 150");
		// OBJECTS OF JComboBox
		cb1 = new JComboBox(qty);
		cb2 = new JComboBox(qty);
		cb3 = new JComboBox(qty);
		cb4 = new JComboBox(qty);
		cb5 = new JComboBox(qty);
		cb6 = new JComboBox(qty);
		// OBJECT OF JButton
		b1 = new JButton("OKAY");

		// ADDING setBounds
		limage.setBounds(0, 0, 800, 450);
		c1.setBounds(50, 50, 220, 30);
		cb1.setBounds(300, 50, 50, 30);
		c2.setBounds(450, 50, 220, 30);
		cb2.setBounds(700, 50, 50, 30);
		c3.setBounds(50, 100, 220, 30);
		cb3.setBounds(300, 100, 50, 30);
		c4.setBounds(450, 100, 220, 30);
		cb4.setBounds(700, 100, 50, 30);
		c5.setBounds(50, 150, 220, 30);
		cb5.setBounds(300, 150, 50, 30);
		c6.setBounds(450, 150, 220, 30);
		cb6.setBounds(700, 150, 50, 30);
		b1.setBounds(350, 200, 100, 30);

		// ADDING TO THE FRAME
		this.add(limage);
		limage.add(c1);
		limage.add(c2);
		limage.add(c3);
		limage.add(c4);
		limage.add(c5);
		limage.add(c6);
		limage.add(cb1);
		limage.add(cb2);
		limage.add(cb3);
		limage.add(cb4);
		limage.add(cb5);
		limage.add(cb6);
		limage.add(b1);

		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		sd_total = 0;
		String s;
		int x;
		if (c1.isSelected()) {
			s = cb1.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			sd_total = sd_total + (200 * x);
		}
		if (c2.isSelected()) {
			s = cb2.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			sd_total = sd_total + (200 * x);
		}
		if (c3.isSelected()) {
			s = cb3.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			sd_total = sd_total + (150 * x);
		}
		if (c4.isSelected()) {
			s = cb4.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			sd_total = sd_total + (150 * x);
		}
		if (c5.isSelected()) {
			s = cb5.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			sd_total = sd_total + (150 * x);
		}
		if (c6.isSelected()) {
			s = cb6.getSelectedItem().toString();
			if (s.equals(" ")) {
				x = 0;
			} else {
				x = Integer.parseInt(s);
			}
			sd_total = sd_total + (150 * x);
		}
		// System.out.println("Your drinks total amount is "+sd_total);
		this.setVisible(false);
		food_of_soft_drinks.setVisible(true);
	}
}

class Bill extends JFrame {
	JLabel limage, ltotal;
	int total = 0;

	Bill(Menu t) {
		ImageIcon i = new ImageIcon("images\\Thankyou.jpg");
		limage = new JLabel(i);
		ltotal = new JLabel();
		ltotal.setFont(new Font("Algerian", Font.BOLD, 40));
		total = total + t.si.si_total;
		total = total + t.chi.chi_total;
		total = total + t.pv.pv_total;
		total = total + t.pi.pi_total;
		total = total + t.st.st_total;
		total = total + t.des.des_total;
		total = total + t.sd.sd_total;

		limage.setBounds(0, 0, 800, 250);
		ltotal.setBounds(100, 300, 600, 50);
		this.add(limage);
		this.add(ltotal);

		ltotal.setText("Yout total bill is " + total + "/-");
	}
}

class Menu extends JFrame implements ActionListener {
	JLabel lname, lbackground;
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8;

	// creating references of each and every single class
	South_Indian si; // b1
	Chinese chi; // b2
	Pav_Bhaji pv; // b3
	Pizza pi; // b4
	Starters st; // b5
	Desserts des; // b6
	Soft_Drink sd; // b0
	Bill bi; // b8

	Menu() {
		lname = new JLabel("--- ROYAL HOTEL ---");
		lname.setForeground(Color.white);
		lname.setFont(new Font("Algerian", Font.BOLD, 65));
		ImageIcon i = new ImageIcon("images\\background 003.jpeg");
		lbackground = new JLabel(i);
		b0 = new JButton("DRINKS");
		b1 = new JButton("SOUTH INDIAN");
		b2 = new JButton("CHINESE");
		b3 = new JButton("PAV BHAJI");
		b4 = new JButton("PIZZA");
		b5 = new JButton("STARTERS");
		b6 = new JButton("DESSERTS");
		b7 = new JButton("A");
		b8 = new JButton("BILL");

		lbackground.setBounds(0, 0, 800, 450);
		lname.setBounds(100, 80, 700, 60);
		b1.setBounds(100, 150, 150, 25);
		b2.setBounds(325, 150, 150, 25);
		b3.setBounds(550, 150, 150, 25);
		b4.setBounds(100, 200, 150, 25);
		b5.setBounds(325, 200, 150, 25);
		b6.setBounds(550, 200, 150, 25);
		b7.setBounds(100, 250, 150, 25);
		b0.setBounds(325, 250, 150, 25);
		b8.setBounds(325, 350, 150, 25);

		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);

		this.add(lbackground);
		lbackground.add(lname);
		lbackground.add(b0);
		lbackground.add(b1);
		lbackground.add(b2);
		lbackground.add(b3);
		lbackground.add(b4);
		lbackground.add(b5);
		lbackground.add(b6);
		lbackground.add(b8);

		// creating object of each and every single class
		si = new South_Indian(this); // b1
		chi = new Chinese(this); // b2
		pv = new Pav_Bhaji(this); // b3
		pi = new Pizza(this); // b4
		st = new Starters(this); // b5
		des = new Desserts(this); // b6
		sd = new Soft_Drink(this); // b0
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("SOUTH INDIAN")) // b1
		{
			this.setVisible(false);
			si.setLayout(null);
			si.setLocation(200, 200);
			si.setSize(800, 450);
			si.setTitle("South Indian");
			si.setVisible(true);
			si.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} else if (e.getActionCommand().equals("CHINESE")) // b2
		{
			this.setVisible(false);
			chi.setLayout(null);
			chi.setLocation(200, 200);
			chi.setSize(800, 450);
			chi.setTitle("Chinese");
			chi.setVisible(true);
			chi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} else if (e.getActionCommand().equals("PAV BHAJI")) // b3
		{
			this.setVisible(false);
			pv.setLayout(null);
			pv.setLocation(200, 200);
			pv.setSize(800, 450);
			pv.setTitle("Pav Bhaji");
			pv.setVisible(true);
			pv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} else if (e.getActionCommand().equals("PIZZA")) // b4
		{
			this.setVisible(false);
			pi.setLayout(null);
			pi.setLocation(200, 200);
			pi.setSize(800, 450);
			pi.setTitle("Pizza");
			pi.setVisible(true);
			pi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} else if (e.getActionCommand().equals("STARTERS")) // b5
		{
			this.setVisible(false);
			st.setLayout(null);
			st.setLocation(200, 200);
			st.setSize(800, 450);
			st.setTitle("Starters");
			st.setVisible(true);
			st.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} else if (e.getActionCommand().equals("DESSERTS")) // b6
		{
			this.setVisible(false);
			des.setLayout(null);
			des.setLocation(200, 200);
			des.setSize(800, 450);
			des.setTitle("Desserts");
			des.setVisible(true);
			des.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} else if (e.getActionCommand().equals("DRINKS")) // b0
		{
			this.setVisible(false);
			sd.setLayout(null);
			sd.setLocation(200, 200);
			sd.setSize(800, 450);
			sd.setTitle("Drinks");
			sd.setVisible(true);
			sd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} else if (e.getActionCommand().equals("BILL")) // b8
		{
			this.setVisible(false);
			bi = new Bill(this);
			bi.setLayout(null);
			bi.setLocation(200, 200);
			bi.setSize(800, 450);
			bi.setTitle("Bill");
			bi.setVisible(true);
			bi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

	public static void main(String args[]) {
		Menu m = new Menu();
		m.setLayout(null);
		m.setLocation(200, 200);
		m.setSize(800, 450);
		m.setTitle("Menu");
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
