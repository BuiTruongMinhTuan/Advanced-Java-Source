package chapter1_18;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class GiftBox {

    public String shape;
    public String color;
    final int PRICE = 10000;

    public GiftBox() {
    }

    public GiftBox(String shape, String color) {
        this.shape = shape;
        this.color = color;
    }
   
    class Gift {

        public String name;
        public double weight;
        final int FEE = 200;

        public Gift() {
        }

        public Gift(String name, double weight) {
            this.name = name;
            this.weight = weight;
        }
         public void outputInfoGift() {
			// TODO Auto-generated method stub
			System.out.println("Shape: " + shape);
			System.out.println("Color: " + color);
			System.out.println("Name: " + name);
			System.out.println("Weight: " + weight);
			System.out.println("Fee: " + calFee());
		}
        public double calFee() {
            return weight * FEE + GiftBox.this.PRICE;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
